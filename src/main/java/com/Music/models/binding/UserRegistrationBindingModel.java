package com.Music.models.binding;

import com.Music.models.validators.FieldMatch;

@FieldMatch(
        first = "password",
        second = "confirmPassword"
)
public class UserRegistrationBindingModel {
}
