package com.fesc.cheorl.Security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JWTAuthorizationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String bearerToken = request.getHeader(ConstantesSecurity.HEADER_STRING);

        if (bearerToken != null && bearerToken.startsWith(ConstantesSecurity.TOKEN_PREFIJO)) {
            String token = bearerToken.replace(ConstantesSecurity.TOKEN_PREFIJO, "");
            UsernamePasswordAuthenticationToken usernamePat = TokenUtils.getAuthentication(token);
            SecurityContextHolder.getContext().setAuthentication(usernamePat);
        }
        filterChain.doFilter(request, response);
    }

}