package com.shop.service.interfaces;

import com.shop.model.Role;

/**
 * Service interface for Role entity.
 * Defines methods for CRUD operations and additional business logic.
 */
public interface RoleService {

   Role getRoleById(long id);

   Role getRoleByName(String name);

}