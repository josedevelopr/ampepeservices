package com.ampep.ampepservices.services;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ampep.ampepservices.entities.Colegio;
import com.ampep.ampepservices.repositories.ColegioRepositorio;
//import com.google.gson.Gson;

//import au.com.bytecode.opencsv.CSVReader;

@Service
public class ColegioServiceImpl implements ColegioService 
{
	@Autowired
	private ColegioRepositorio repositorio;
	
	@Override
	public List<Colegio> listar() {
		return repositorio.findAll();
	}

	@Override
	public Colegio listarId(int id) {
		return repositorio.findByIdColegio(id);
	}

	@Override
	public Colegio add(Colegio p) {
		return repositorio.save(p);
	}

	@Override
	public Colegio edit(Colegio p) {
		return repositorio.save(p);
	}

	@Override
	public Colegio delete(int id) {
		Colegio cole = repositorio.findByIdColegio(id);
		if(cole!=null) {
			repositorio.delete(cole);
		}
		return cole;
	}

	public static final char SEPARATOR = ',';
	public static final char QUOTE = '"';
	
	@Override
	public String validarColegioYRpresentante(String codmoular, String dni) {
//		CSVReader reader = null;
//		int rowNumber = 0;
//		int rowNumberData = -1;
//		String colegioJson = null;
//		try
//		{
//			
//			reader = new CSVReader(new FileReader("D:/Desarrollo/archivos/cole.csv"),SEPARATOR,QUOTE);
//			String[] nextLine = null;
//			
//			while((nextLine = reader.readNext())!=null)
//			{
//				rowNumber++;
//				if(nextLine[0].toString().equals(codmoular))
//				{
//					rowNumberData = rowNumber;
//					//System.out.print(rowNumber+"");
//					//System.out.print(alldata.get(rowNumberData).toString());
//					Gson gson = new Gson();
//					
//					colegioJson =  gson.toJson(Arrays.toString(nextLine));
//					//System.out.println("ColegioJSon = "+colegioJson);
//					//System.out.println(Arrays.toString(nextLine));
//					break;
//					
//				}				
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.print(e.getMessage());
//		}
//		finally
//		{
//			if(null != reader)
//			{
//				try
//				{
//					reader.close();
//				}
//				catch(Exception e)
//				{
//					e.printStackTrace();
//				}
//				
//			}
//		}
		//return colegioJson;
		return null;

	}

}
