package com.example.codeclan.files.components;

import com.codeclan.filesandfolders.FilesAndFolders.models.File;
import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import com.codeclan.filesandfolders.FilesAndFolders.models.User;
import com.codeclan.filesandfolders.FilesAndFolders.repository.FileRepository;
import com.codeclan.filesandfolders.FilesAndFolders.repository.FolderRepository;
import com.codeclan.filesandfolders.FilesAndFolders.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user = new User("Jake");
        userRepository.save(user);
        Folder folder = new Folder("Folder", user);
        folderRepository.save(folder);
        File file = new File("File", "asdf", 10, folder);
        fileRepository.save(file);
    }
}