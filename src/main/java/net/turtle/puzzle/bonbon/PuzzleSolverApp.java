package net.turtle.puzzle.bonbon;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

public class PuzzleSolverApp {

  static String[] boardA = {
    "███████████████████████████████",
    "█   █   █ █   █   █     █  █   ",
    "███ █ █ █ █ █████ █ ███ █ ██ ██",
    "█   █ █   █   █   █ █ █ █ █   █",
    "█ ███ ███ █ █ █ █ █ █ █ █   ███",
    "█     █     █   █     █   █   █",
    "███████████████████████████████",
  };

  static final String[] boardB = {
    "███████████████████████████████",
    "█     █     █   █       █   █  ",
    "█ ███ █ █ ███ ███ ███ ███ ███ █",
    "█   █ █ █       █   █     █   █",
    "█ █ █ █ ███ ███ ███ █ ███ █ █ █",
    "█ █ █     █   █     █ █     █ █",
    "███████████████████████████████",
  };

  static final int[] pinHorizontalPositions = {1, 7, 13, 19, 25};

  public static void main(String[] args) {

    for (int i = 6; i >= 0; i--) {
      StringBuilder sb = new StringBuilder();
      System.out.println("\"" + sb.append(boardA[i]).reverse().toString() + "\",");
    }

    for (int i = 6; i >= 0; i--) {
      StringBuilder sb = new StringBuilder();
      System.out.println("\"" + sb.append(boardB[i]).reverse().toString() + "\",");
    }

    int boardAOffset = 0;
    int boardBOffset = 0;

    final int[] pinVerticalPositions = {1, 3, 5, 5, 5};

    /*
     * We are facing board A (dark).
     */

    boolean boardAOut = false;
    boolean boardBOut = false;

    move(new ArrayList<>(0), new State(pinVerticalPositions, 0, 0));
  }

  private static void move(List<State> prev, State state) {
    if (!prev.contains(state)) {
      prev.add(state);

      if (state.getBoardAOffset() < 31) {}
    }
  }

  @Data
  @AllArgsConstructor
  @EqualsAndHashCode
  public static class State {
    final int[] pinVerticalPositions;
    int boardAOffset = 0;
    int boardBOffset = 0;

    public State movePin(int pinNumber, boolean up) {
      return null;
    }

    public State clone() {
      return new State(pinVerticalPositions.clone(), boardAOffset, boardBOffset);
    }
  }
}
