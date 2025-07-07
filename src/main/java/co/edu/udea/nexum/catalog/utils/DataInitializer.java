package co.edu.udea.nexum.catalog.utils;

import co.edu.udea.nexum.catalog.common.domain.utils.annotations.Generated;
import co.edu.udea.nexum.catalog.identity_document_type.domain.utils.enums.DocumentType;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.entity.IdentityDocumentTypeEntity;
import co.edu.udea.nexum.catalog.identity_document_type.infrastructure.output.jpa.repository.IdentityDocumentTypeRepository;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.entity.ProgramEntity;
import co.edu.udea.nexum.catalog.program.infrastructure.output.jpa.repository.ProgramRepository;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.entity.ProgramVersionEntity;
import co.edu.udea.nexum.catalog.program_version.infrastructure.output.jpa.repository.ProgramVersionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Generated
@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final IdentityDocumentTypeRepository documentTypeRepository;
    private final ProgramRepository programRepository;
    private final ProgramVersionRepository programVersionRepository;

    // Constants for Programs and Versions
    public static final String PROGRAM_CS = "Ciencias de la Computación";
    public static final String PROGRAM_EE = "Ingeniería Eléctrica";
    public static final String PROGRAM_MATH = "Matemáticas";
    public static final String PROGRAM_PHYS = "Física";

    public static final String SNIES_CS = "CS-123";
    public static final String SNIES_EE = "EE-456";
    public static final String SNIES_MATH = "MATH-789";
    public static final String SNIES_PHYS = "PHYS-321";


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

            // Initialize Document Types
            List<IdentityDocumentTypeEntity> documentTypes = Arrays.stream(DocumentType.values())
                    .map(type -> {
                        log.info("Creating identity document type {}", type);
                        return IdentityDocumentTypeEntity.builder()
                                .documentType(type)
                                .build();
                    })
                    .toList();

            documentTypeRepository.saveAll(documentTypes);

            // Initialize Entities like Programs and Versions
            initializeEntities();
        };
    }

    private void initializeEntities() {
        // Define and save Programs dynamically
        List<ProgramEntity> programs = getPrograms();
        programRepository.saveAll(programs);

        // Define and save Program Versions dynamically
        List<ProgramVersionEntity> programVersions = getProgramVersions(programs);
        programVersionRepository.saveAll(programVersions);
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
}
