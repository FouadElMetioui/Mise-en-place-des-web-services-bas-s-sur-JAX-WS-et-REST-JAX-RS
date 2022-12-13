package jaxWs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jaxWs.service.Carburant;
import jaxWs.service.Station;
import jaxWs.service.StationWs;
import jaxWs.service.StationWsImplService;

@WebServlet("/StationServlet")
public class StationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StationWsImplService serv = new StationWsImplService();
	StationWs op = serv.getStationWsImplPort();
	Station s = new Station();
	Carburant c = new Carburant();

	public StationServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "index":

				ShowIndex(request, response);
				break;

			case "ajouterSta":

				ajouterStation(request, response);
				break;
			case "ajouterCar":

				ajouterCarburant(request, response);
				break;

			case "deleteSta":

				deleteStation(request, response);
				break;

			case "deleteCar":

				deleteCarburant(request, response);
				break;

			case "editSta":

				editStation(request, response);
				break;

			case "updateSta":

				updateSta(request, response);
				break;

			case "editCar":

				editCarburant(request, response);
				break;

			case "updateCar":

				updateCarburant(request, response);
				break;

			default:
				ShowIndex(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void updateCarburant(HttpServletRequest request, HttpServletResponse response) {
		int code = Integer.parseInt(request.getParameter("code"));

		String nom = request.getParameter("nom");
		String designation = request.getParameter("designation");
		Carburant carburant = new Carburant(nom, designation);

		op.updateCarburant(carburant);
		ShowIndex(request, response);

	}

	private void editCarburant(HttpServletRequest request, HttpServletResponse response) {
		int code = Integer.parseInt(request.getParameter("code"));
		c = op.findCarburant(code);
		request.setAttribute("carburant", c);
		ShowIndex(request, response);

	}

	private void editStation(HttpServletRequest request, HttpServletResponse response) {
		int code = Integer.parseInt(request.getParameter("code"));
		s = op.findStation(code);
		request.setAttribute("station", s);
		ShowIndex(request, response);

	}

	private void updateSta(HttpServletRequest request, HttpServletResponse response) {
		int code = Integer.parseInt(request.getParameter("code"));

		String nom = request.getParameter("nom");
		String addres = request.getParameter("addrr");
		Station station = new Station(nom, addres);

		op.updateStation(station);
		ShowIndex(request, response);

	}

	private void deleteCarburant(HttpServletRequest request, HttpServletResponse response) {
		int code = Integer.parseInt(request.getParameter("code"));

		Carburant car = new Carburant();
		car = op.findCarburant(code);
		op.deleteCarburant(car);
	}

	private void deleteStation(HttpServletRequest request, HttpServletResponse response) {
		int code = Integer.parseInt(request.getParameter("code"));

		Station station = new Station();
		station = op.findStation(code);

		op.deleteStation(station);

	}

	private void ajouterCarburant(HttpServletRequest request, HttpServletResponse response) {
		String nom = request.getParameter("nom");
		String designation = request.getParameter("designation");

		op.creerCarburant(nom, designation);
		ShowIndex(request, response);

	}

	private void ajouterStation(HttpServletRequest request, HttpServletResponse response) {
		String nom = request.getParameter("nom");
		String addres = request.getParameter("addrr");

		op.creerStation(nom, addres);
		ShowIndex(request, response);

	}

	private void ShowIndex(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("jsp/station.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
