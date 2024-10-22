package com.Music.models.entities;

import com.Music.models.entities.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRoleEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private UserRole role;

    public UserRole getRole() {
        return role;
    }

    public UserRoleEntity setRole(UserRole role) {
        this.role = role;
        return this;
    }
}
