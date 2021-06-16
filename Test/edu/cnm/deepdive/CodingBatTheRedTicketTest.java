package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheRedTicketTest {

  private int[][] ticketParams = {
      {2, 2, 2},
      {2, 2, 1},
      {0, 0, 0},
      {2, 0, 0},
      {1, 1, 1},
      {1, 2, 1},
      {1, 2, 0},
      {0, 2, 2},
      {1, 2, 2},
      {0, 2, 0},
      {1, 1, 2}
  };


  private int[] ticketExpected = {10, 0, 5, 1, 5, 0, 1, 1, 1, 0, 0};


  @Test
  void redTicket() {
    for (int i = 0; i < ticketParams.length; i++) {
      int actual = CodingBatTheRedTicket.redTicket(ticketParams[i][0], ticketParams[i][1], ticketParams[i][2]);
      Assertions.assertEquals(ticketExpected[i], actual);
    }

  }

}