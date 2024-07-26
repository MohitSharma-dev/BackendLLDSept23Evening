package ParkingLot;

import ParkingLot.Controllers.TicketController;
import ParkingLot.DataBase.DataBaseController;
import ParkingLot.Repositories.*;
import ParkingLot.Services.TicketService;
import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.models.AllowedVehicleType;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        OperatorRepository operatorRepository = new OperatorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();


        DataBaseController.InitializeDataBaseTransaction(gateRepository,parkingLotRepository,operatorRepository,parkingFloorRepository,parkingSlotRepository);

        TicketService ticketService = new TicketService(gateRepository,vehicleRepository,
                parkingLotRepository,ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateNumber("1A");
        issueTicketRequestDTO.setVehicleNumber("KA 09 567");
        issueTicketRequestDTO.setOwnerName("Radha");
        issueTicketRequestDTO.setVehicleType(AllowedVehicleType.CAR);
        issueTicketRequestDTO.setParkingLotId(1);

       IssueTicketResponseDTO issueTicketResponseDTO = ticketController.issueTicket(issueTicketRequestDTO);

       System.out.println("Ticket Details Below");
       System.out.println("Ticket Id : " + issueTicketResponseDTO.getTicketId());
       System.out.println("Assigned Slot : "+ issueTicketResponseDTO.getParkingSlotNumber());



    }
}
