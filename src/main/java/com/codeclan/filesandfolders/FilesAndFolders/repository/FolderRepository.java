package com.codeclan.filesandfolders.FilesAndFolders.repository;

import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
