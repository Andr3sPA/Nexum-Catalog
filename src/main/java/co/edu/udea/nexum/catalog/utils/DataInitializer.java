package co.edu.udea.nexum.catalog.utils;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.entity.IdentityDocumentTypeEntity;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.repository.IdentityDocumentTypeRepository;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository.ProgramRepository;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.entity.ProgramVersionEntity;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.repository.ProgramVersionRepository;
import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.entity.JobAreaEntity;
import co.edu.udea.nexum.catalog.job_area.infrastructure.output.jpa.repository.JobAreaRepository;
import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.entity.JobDelayEntity;
import co.edu.udea.nexum.catalog.job_delay.infrastructure.output.jpa.repository.JobDelayRepository;
import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.entity.JobInstitutionTypeEntity;
import co.edu.udea.nexum.catalog.job_institution_type.infrastructure.output.jpa.repository.JobInstitutionTypeRepository;
import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.entity.ProgramCompetencyEntity;
import co.edu.udea.nexum.catalog.program_competency.infrastructure.output.jpa.repository.ProgramCompetencyRepository;
import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.entity.SalaryRangeEntity;
import co.edu.udea.nexum.catalog.salary_range.infrastructure.output.jpa.repository.SalaryRangeRepository;
import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.entity.InnovationProcessTypeEntity;
import co.edu.udea.nexum.catalog.innovation_process_type.infrastructure.output.jpa.repository.InnovationProcessTypeRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
@Generated
@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final IdentityDocumentTypeRepository documentTypeRepository;
    private final ProgramRepository programRepository;
    private final ProgramVersionRepository programVersionRepository;
    private final JobAreaRepository jobAreaRepository;
    private final JobDelayRepository jobDelayRepository;
    private final JobInstitutionTypeRepository jobInstitutionTypeRepository;
    private final ProgramCompetencyRepository programCompetencyRepository;
    private final SalaryRangeRepository salaryRangeRepository;
    private final InnovationProcessTypeRepository innovationProcessTypeRepository;

    public static final String PROGRAM_CS = "Ciencias de la Computación";
    public static final String PROGRAM_EE = "Ingeniería Eléctrica";
    public static final String PROGRAM_MATH = "Matemáticas";
    public static final String PROGRAM_PHYS = "Física";

    public static final String SNIES_CS = "123";
    public static final String SNIES_EE = "456";
    public static final String SNIES_MATH = "789";
    public static final String SNIES_PHYS = "321";

    public static final short VERSION_1 = 1;
    public static final short VERSION_2 = 2;

    public static final int YEAR_START_CS_1 = 2020;
    public static final int YEAR_END_CS_1 = 2024;
    public static final int YEAR_START_CS_2 = 2025;
    public static final int YEAR_END_CS_2 = 2029;

    public static final int YEAR_START_EE_1 = 2019;
    public static final int YEAR_END_EE_1 = 2023;
    public static final int YEAR_START_EE_2 = 2024;
    public static final int YEAR_END_EE_2 = 2028;

    public static final int YEAR_START_MATH_1 = 2020;
    public static final int YEAR_END_MATH_1 = 2024;
    public static final int YEAR_START_MATH_2 = 2025;
    public static final int YEAR_END_MATH_2 = 2029;

    public static final int YEAR_START_PHYS_1 = 2021;
    public static final int YEAR_END_PHYS_1 = 2025;

    @Bean
    public CommandLineRunner init() {
        return args -> {
            if (documentTypeRepository.count() > 0) return;

            log.info("Initializing data ...");

            List<IdentityDocumentTypeEntity> documentTypes = Arrays.stream(DocumentType.values())
                    .map(type -> IdentityDocumentTypeEntity.builder().documentType(type).build())
                    .toList();
            documentTypeRepository.saveAll(documentTypes);

            List<ProgramEntity> programs = getPrograms();
            programRepository.saveAll(programs);

            List<ProgramVersionEntity> programVersions = getProgramVersions(programs);
            programVersionRepository.saveAll(programVersions);

            initializeJobAreas(programs);
            initializeJobDelays();
            initializeJobInstitutionTypes(programs);
            initializeProgramCompetencies(programs);
            initializeSalaryRanges();
            initializeInnovationProcessTypes();
        };
    }

    private List<ProgramEntity> getPrograms() {
        return Arrays.asList(
                createProgram(PROGRAM_CS, SNIES_CS),
                createProgram(PROGRAM_EE, SNIES_EE),
                createProgram(PROGRAM_MATH, SNIES_MATH),
                createProgram(PROGRAM_PHYS, SNIES_PHYS)
        );
    }

    private ProgramEntity createProgram(String name, String sniesCode) {
        log.info("Creating program {}: {}", name, sniesCode);
        return ProgramEntity.builder()
                .name(name)
                .code(sniesCode)
                .build();
    }

    private List<ProgramVersionEntity> getProgramVersions(List<ProgramEntity> programs) {
        return Arrays.asList(
                createProgramVersion(programs.get(0), VERSION_1, YEAR_START_CS_1, YEAR_END_CS_1),
                createProgramVersion(programs.get(0), VERSION_2, YEAR_START_CS_2, YEAR_END_CS_2),
                createProgramVersion(programs.get(1), VERSION_1, YEAR_START_EE_1, YEAR_END_EE_1),
                createProgramVersion(programs.get(1), VERSION_2, YEAR_START_EE_2, YEAR_END_EE_2),
                createProgramVersion(programs.get(2), VERSION_1, YEAR_START_MATH_1, YEAR_END_MATH_1),
                createProgramVersion(programs.get(2), VERSION_2, YEAR_START_MATH_2, YEAR_END_MATH_2),
                createProgramVersion(programs.get(3), VERSION_1, YEAR_START_PHYS_1, YEAR_END_PHYS_1)
        );
    }

    private ProgramVersionEntity createProgramVersion(ProgramEntity program, short version, int startYear, int endYear) {
        log.info("Creating program version {}: {}", program.getName(), version);
        return ProgramVersionEntity.builder()
                .program(program)
                .version(version)
                .startYear(startYear)
                .endYear(endYear)
                .build();
    }
    private void initializeJobAreas(List<ProgramEntity> programs) {
        log.info("Creating Job Areas...");
        List<JobAreaEntity> areas = programs.stream()
                .flatMap(program -> Stream.of(
                        JobAreaEntity.builder().name("Desarrollo de software").description("Desarrollador backend").program(program).build(),
                        JobAreaEntity.builder().name("Soporte técnico").description("Infraestructura y redes").program(program).build(),
                        JobAreaEntity.builder().name("Análisis de datos").description("Procesamiento de grandes volúmenes de datos").program(program).build(),
                        JobAreaEntity.builder().name("Seguridad informática").description("Análisis de vulnerabilidades y amenazas").program(program).build()
                ))
                .toList();
        jobAreaRepository.saveAll(areas);
    }

    private void initializeJobDelays() {
        log.info("Creating Job Delays...");
        List<JobDelayEntity> delays = Arrays.asList(
                JobDelayEntity.builder().label("Menos de 1 mes").order(1).active(true).creationDate(now()).lastUpdate(now()).build(),
                JobDelayEntity.builder().label("1 a 3 meses").order(2).active(true).creationDate(now()).lastUpdate(now()).build(),
                JobDelayEntity.builder().label("4 a 6 meses").order(3).active(true).creationDate(now()).lastUpdate(now()).build(),
                JobDelayEntity.builder().label("Más de 6 meses").order(4).active(true).creationDate(now()).lastUpdate(now()).build(),
                JobDelayEntity.builder().label("Más de un año").order(5).active(true).creationDate(now()).lastUpdate(now()).build()
        );
        jobDelayRepository.saveAll(delays);
    }

    private void initializeJobInstitutionTypes(List<ProgramEntity> programs) {
        log.info("Creating Job Institution Types...");
        List<JobInstitutionTypeEntity> types = programs.stream()
                .flatMap(program -> Stream.of(
                        JobInstitutionTypeEntity.builder().name("Universidad pública").description("Educación estatal").program(program).build(),
                        JobInstitutionTypeEntity.builder().name("Universidad privada").description("Educación privada").program(program).build(),
                        JobInstitutionTypeEntity.builder().name("Empresa de tecnología").description("Sector tecnológico").program(program).build(),
                        JobInstitutionTypeEntity.builder().name("Gobierno").description("Instituciones públicas y gubernamentales").program(program).build(),
                        JobInstitutionTypeEntity.builder().name("ONG").description("Organizaciones sin ánimo de lucro").program(program).build()
                )).toList();
        jobInstitutionTypeRepository.saveAll(types);
    }

    private void initializeProgramCompetencies(List<ProgramEntity> programs) {
        log.info("Creating Program Competencies...");
        List<ProgramCompetencyEntity> competencies = programs.stream()
                .flatMap(program -> Stream.of(
                        ProgramCompetencyEntity.builder().name("Resolución de problemas").description("Capacidad de identificar y resolver").program(program).build(),
                        ProgramCompetencyEntity.builder().name("Pensamiento crítico").description("Evaluar situaciones complejas").program(program).build(),
                        ProgramCompetencyEntity.builder().name("Comunicación efectiva").description("Comunicación oral y escrita").program(program).build(),
                        ProgramCompetencyEntity.builder().name("Programación avanzada").description("Dominio de algoritmos y estructuras de datos").program(program).build(),
                        ProgramCompetencyEntity.builder().name("Ética profesional").description("Actuar con responsabilidad social").program(program).build()
                )).toList();
        programCompetencyRepository.saveAll(competencies);
    }

    private void initializeSalaryRanges() {
        log.info("Creating Salary Ranges...");
        List<SalaryRangeEntity> ranges = Arrays.asList(
                SalaryRangeEntity.builder().salary("Menos de $1M").order(1).active(true).creationDate(now()).lastUpdate(now()).build(),
                SalaryRangeEntity.builder().salary("$1M - $2M").order(2).active(true).creationDate(now()).lastUpdate(now()).build(),
                SalaryRangeEntity.builder().salary("$2M - $3M").order(3).active(true).creationDate(now()).lastUpdate(now()).build(),
                SalaryRangeEntity.builder().salary("$3M - $4M").order(4).active(true).creationDate(now()).lastUpdate(now()).build(),
                SalaryRangeEntity.builder().salary("Más de $4M").order(5).active(true).creationDate(now()).lastUpdate(now()).build()
        );
        salaryRangeRepository.saveAll(ranges);
    }

    private void initializeInnovationProcessTypes() {
        log.info("Creating Innovation Process Types...");
        List<InnovationProcessTypeEntity> processes = Arrays.asList(
                InnovationProcessTypeEntity.builder().name("Proyectos de innovación social").description("Participación comunitaria").enabled(true).build(),
                InnovationProcessTypeEntity.builder().name("Investigación aplicada").description("Proyectos de investigación con fines prácticos").enabled(true).build(),
                InnovationProcessTypeEntity.builder().name("Educación alternativa").description("Programas no formales de formación").enabled(true).build(),
                InnovationProcessTypeEntity.builder().name("Intraemprendimiento").description("Innovación desde dentro de organizaciones").enabled(true).build(),
                InnovationProcessTypeEntity.builder().name("Transferencia tecnológica").description("Aplicación de tecnología en sectores tradicionales").enabled(true).build(),
                InnovationProcessTypeEntity.builder().name("Proyectos colaborativos con la industria").description("Innovación conjunta con empresas").enabled(true).build(),
                InnovationProcessTypeEntity.builder().name("Participación en semilleros de investigación").description("Formación investigativa en etapas tempranas").enabled(true).build()
        );
        innovationProcessTypeRepository.saveAll(processes);
    }

    private LocalDateTime now() {
        return LocalDateTime.now();
    }
}

