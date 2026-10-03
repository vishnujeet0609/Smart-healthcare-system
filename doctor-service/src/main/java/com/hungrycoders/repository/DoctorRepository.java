package com.example.repository;

import com.example.model.Doctor;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, UUID> {
    // Custom query methods (optional)
    Optional<Doctor> findByEmail(String email);
}
