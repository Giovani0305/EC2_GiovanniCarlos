  package ec2.idat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec2.idat.app.DTO.UsuarioDTORequest;
import ec2.idat.app.DTO.UsuarioDTOResponse;
import ec2.idat.app.security.TokenUtil;
import ec2.idat.app.security.UserDetailService;


@RestController
public class UsuarioController {

	@Autowired
	private TokenUtil util;
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken",method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioDTORequest request){
		
		UserDetails user = service.loadUserByUsername(request.getUsuario());
		if (user.getPassword().equals(request.getContrasena())) 

			return ResponseEntity.ok(new UsuarioDTOResponse(util.generateToken(user.getUsername())));
		else
			throw new UsernameNotFoundException("Contraseña Incorrecta");
	}
	
}