package com.codeclan.filesandfolders.FilesAndFolders.repository;

import com.codeclan.filesandfolders.FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
