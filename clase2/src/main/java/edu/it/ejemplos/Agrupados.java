package edu.it.ejemplos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

class TotalPromedio {
	public final Long total;
	public final Double promedio;
	
	public TotalPromedio(Long total, Double promedio) {
		this.total = total;
		this.promedio = promedio;
	}
}

public class Agrupados implements EjemploJPA {
	Logger logger = LoggerFactory.getLogger(getClass());
	private TotalPromedio convertir(List<Object[]> listaDeArrDeObj) {
	
		if (listaDeArrDeObj.size() == 0) {
			throw new RuntimeException("La lista vino vacia");
		}
		
		TotalPromedio tp = new TotalPromedio(
				(Long)listaDeArrDeObj.get(0)[0],
				(Double)listaDeArrDeObj.get(0)[1]
				);
		
		return tp;
	}
	public void run(EntityManager em) {
		String strSQLJpa = "SELECT count(u), avg(saldo) from Usuario u";
		Query query = em.createQuery(strSQLJpa);
		List<Object[]> res = query.getResultList();
	
		var tp = convertir(res);
		
		logger.info(new Gson().toJson(tp));
	}
}
