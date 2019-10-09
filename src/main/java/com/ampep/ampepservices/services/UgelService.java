package com.ampep.ampepservices.services;

import java.util.List;

import com.ampep.ampepservices.controller.Ugel;


public interface UgelService 
{
	List<Ugel>listar();
	Ugel listarId(int id);
}
