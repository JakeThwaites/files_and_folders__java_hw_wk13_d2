package com.codeclan.filesandfolders.FilesAndFolders;

import com.codeclan.filesandfolders.FilesAndFolders.models.File;
import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import com.codeclan.filesandfolders.FilesAndFolders.models.User;
import com.codeclan.filesandfolders.FilesAndFolders.repository.FileRepository;
import com.codeclan.filesandfolders.FilesAndFolders.repository.FolderRepository;
import com.codeclan.filesandfolders.FilesAndFolders.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesAndFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canLoadFilesAndFolders(){

		User user = new User("Jake");
		userRepository.save(user);
		Folder folder = new Folder("Folder", user);
		folderRepository.save(folder);
		File file = new File("File", "asdf", 10, folder);
		fileRepository.save(file);

	}

}

