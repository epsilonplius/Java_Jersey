package com.epsilonplius.rest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;

import com.epsilonplius.Entity.Preke;

@Path("/Values")
public class Values {

	@GET
	@Path("/{param}")
	public Response getValues(@PathParam("param") String msg) {

		String output = "Hello";

		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/")
	@Produces("application/json")
	public List<Preke> getValuesAlone() {

		List<Preke> prekes = new ArrayList<Preke>() {
			private static final long serialVersionUID = 1L;

			{
				add(new Preke() {
					{
						setKaina(new BigDecimal(10.15));
						setKiekis(5);
						setKodas("1");
						setPavadinimas("Preke1");
					}
				});

				add(new Preke() {
					{
						setKaina(new BigDecimal(10.15));
						setKiekis(5);
						setKodas("2");
						setPavadinimas("Preke2");
					}
				});

			}

		};

		return prekes;
	}

}
