package org.example.dmaker.service;

import lombok.RequiredArgsConstructor;
import org.example.dmaker.entity.Developer;
import org.example.dmaker.repository.DeveloperRepository;
import org.example.dmaker.type.DeveloperLevel;
import org.example.dmaker.type.DeveloperSkillType;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor // serviece, controller는 얘가 있으며 편하다.
public class DMakerService {
    private final DeveloperRepository developerRepository; // 바로 DI된다. (위에 어노테이션 덕분에)
    //final이 있으면 무조건 있어야하는거라서 생성자가 만들어진다.

    @Transactional
    public void createDeveloper(){
        Developer developer = Developer.builder()
                .developerLevel(DeveloperLevel.JUNIOR)
                .developerSkillType(DeveloperSkillType.BACKEND)
                .experienceYears(3)
                .name("복래")
                .age(2)
                .build();

        developerRepository.save(developer);

    }

}
