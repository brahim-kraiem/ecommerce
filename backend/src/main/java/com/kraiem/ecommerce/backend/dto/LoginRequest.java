package com.kraiem.ecommerce.backend.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * @author : Kraiem Brahim
 * @Project: backend
 * @Date : 17 3/17/2026 8:27 AM
 **/
public record LoginRequest(
        @Email(message = "Email should be valid") @NotBlank(message = "Email is required") String email,
        @NotBlank(message = "Password is required") String password
) {}