package com.platformnexus.app.unanimous.entity.repo;

import com.platformnexus.app.unanimous.entity.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by felixchiu on 3/13/16.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
}
