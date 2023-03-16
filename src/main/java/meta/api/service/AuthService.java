package meta.api.service;

import meta.api.payload.LoginDto;
import meta.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
