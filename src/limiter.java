/**
 * Created by azama on 4/22/2017.
 */
public class limiter {
    public static int[][][] limits = {{{0,470}, {0,10}}, {{145,156}, {96,307}}, {{750,760}, {187,245}}, {{240,251}, {187,245}}, {{530,1000}, {0,10}}, {{99,297}, {47,57}}, {{334,666}, {47,57}}, {{703,901}, {47,57}}, {{52,62}, {47,235}}, {{193,204}, {57,105}}, {{428,438}, {57,105}}, {{561,573}, {57,105}}, {{797,807}, {57,105}}, {{287,344}, {94,105}}, {{472,529}, {94,105}}, {{656,714}, {94,105}}, {{193,391}, {141,152}}, {{428,573}, {141,152}}, {{609,807}, {141,152}}, {{145,156}, {96,107}}, {{156,203}, {187,198}}, {{240,344}, {187,198}}, {{428,573}, {187,198}}, {{656,760}, {187,198}}, {{797,843}, {187,198}}, {{843,854}, {94,305}}, {{938,948}, {47,235}}, {{240,251}, {187,198}}, {{381,438}, {234,245}}, {{561,619}, {234,245}}, {{750,760}, {187,198}}, {{0,15}, {0,307}}, {{0,15}, {341,646}}, {{52,62}, {295,352}}, {{99,108}, {94,552}}, {{145,156}, {341,552}}, {{193,204}, {234,412}}, {{204,251}, {295,305}}, {{204,251}, {340,352}}, {{287,297}, {305,341}}, {{334,344}, {234,412}}, {{428,438}, {295,351}}, {{499,501}, {305,341}}, {{428,465}, {295,305}}, {{535,572}, {295,305}}, {{428,572}, {341,351}}, {{562,572}, {295,351}}, {{656,667}, {234,412}}, {{702,714}, {305,341}}, {{750,797}, {295,305}}, {{750,797}, {340,352}}, {{797,807}, {234,412}}, {{891,901}, {94,552}}, {{938,948}, {295,352}}, {{985,1000}, {341,646}}, {{985,1000}, {0,307}}, {{156,203}, {447,459}}, {{240,251}, {401,459}}, {{240,344}, {447,459}}, {{381,391}, {401,552}}, {{472,529}, {401,412}}, {{428,562}, {447,459}}, {{609,619}, {401,552}}, {{656,760}, {447,459}}, {{750,760}, {401,459}}, {{843,854}, {341,552}}, {{797,844}, {447,459}}, {{193,344}, {494,506}}, {{428,562}, {494,506}}, {{656,807}, {494,506}}, {{938,948}, {411,594}}, {{52,62}, {411,594}}, {{193,204}, {541,589}}, {{240,251}, {506,552}}, {{287,297}, {541,589}}, {{428,438}, {541,589}}, {{472,529}, {541,552}}, {{561,573}, {541,589}}, {{702,714}, {541,589}}, {{750,760}, {506,552}}, {{797,807}, {541,589}}, {{99,297}, {589,599}}, {{334,666}, {589,599}}, {{702,901}, {589,599}}, {{0,470}, {636,646}}, {{530,1000}, {636,646}}};
    // will be used soon
    public static int[][][][] limitsInParts = {
            {{{145,156},{96,307}}, {{99,297},{47,57}}, {{52,62},{47,235}}, {{145,156},{96,107}}, {{99,108},{94,552}}},
            {{{99,297},{47,57}}, {{193,204},{57,105}}, {{287,344},{94,105}}, {{193,391},{141,152}}},
            {{{0,470},{0,10}}, {{428,438},{57,105}}, {{287,344},{94,105}}, {{472,529},{94,105}}, {{193,391},{141,152}}, {{428,573},{141,152}}},
            {{{530,1000},{0,10}}, {{334,666},{47,57}}, {{561,573},{57,105}}, {{472,529},{94,105}}, {{656,714},{94,105}}, {{428,573},{141,152}}, {{609,807},{141,152}}},
            {{{703,901},{47,57}}, {{797,807},{57,105}}, {{656,714},{94,105}}, {{609,807},{141,152}}},
            {{{530,1000},{0,10}}, {{703,901},{47,57}}, {{843,854},{94,305}}, {{938,948},{47,235}}, {{891,900},{94,552}}},
            {{{145,156},{96,307}}, {{52,62},{47,235}}, {{156,203},{187,198}}, {{0,15},{0,307}}, {{52,62},{295,352}}},
            {{{240,251},{187,245}}, {{156,203},{187,198}}, {{240,344},{187,198}}, {{240,251},{187,198}}, {{193,204},{234,412}}, {{204,251},{295,305}}, {{287,297},{305,341}}},
            {{{240,344},{187,198}}, {{428,573},{187,198}}, {{381,438},{234,245}}, {{334,344},{234,412}}, {{428,438},{295,351}}, {{428,470},{295,305}}},
            {{{428,573},{187,198}}, {{656,760},{187,198}}, {{561,619},{234,245}}, {{530,572},{295,305}}, {{562,572},{295,351}}, {{656,667},{234,412}}},
            {{{750,760},{187,245}}, {{656,760},{187,198}}, {{797,843},{187,198}}, {{750,760},{187,198}}, {{702,714},{305,341}}, {{750,797},{295,305}}, {{797,807},{234,412}}},
            {{{797,843},{187,198}}, {{843,854},{94,305}}, {{938,948},{47,235}}, {{938,948},{295,352}}, {{985,1000},{0,307}}},
            {{{0,15},{341,646}}, {{52,62},{295,352}}, {{145,156},{341,552}}, {{156,203},{447,459}}, {{52,62},{411,594}}},
            {{{193,204},{234,412}}, {{204,251},{340,352}}, {{287,297},{305,341}}, {{156,203},{447,459}}, {{240,251},{401,459}}, {{240,344},{447,459}}, {{193,344},{494,506}}},
            {{{334,344},{234,412}}, {{428,438},{295,351}}, {{428,572},{341,351}}, {{240,344},{447,459}}, {{381,391},{401,552}}, {{472,529},{401,412}}, {{428,562},{447,459}}, {{193,344},{494,506}}, {{428,562},{494,506}}},
            {{{428,572},{341,351}}, {{562,572},{295,351}}, {{656,667},{234,412}}, {{472,529},{401,412}}, {{428,562},{447,459}}, {{609,619},{401,552}}, {{656,760},{447,459}}, {{428,562},{494,506}}, {{656,807},{494,506}}},
            {{{702,714},{305,341}}, {{750,797},{340,352}}, {{797,807},{234,412}}, {{656,760},{447,459}}, {{750,760},{401,459}}, {{797,844},{447,459}}, {{656,807},{494,506}}},
            {{{938,948},{295,352}}, {{985,1000},{341,646}}, {{843,854},{341,552}}, {{797,844},{447,459}}, {{938,948},{411,594}}},
            {{{0,15},{341,646}}, {{99,108},{94,552}}, {{145,156},{341,552}}, {{52,62},{411,594}}, {{99,297},{589,599}}},
            {{{193,344},{494,506}}, {{193,204},{541,589}}, {{240,251},{506,552}}, {{287,297},{541,589}}, {{99,297},{589,599}}},
            {{{381,391},{401,552}}, {{193,344},{494,506}}, {{428,562},{494,506}}, {{428,438},{541,589}}, {{472,529},{541,552}}, {{0,470},{636,646}}},
            {{{609,619},{401,552}}, {{428,562},{494,506}}, {{656,807},{494,506}}, {{472,529},{541,552}}, {{561,573},{541,589}}, {{334,666},{589,599}}, {{530,1000},{636,646}}},
            {{{656,807},{494,506}}, {{702,714},{541,589}}, {{750,760},{506,552}}, {{797,807},{541,589}}, {{702,901},{589,599}}},
            {{{891,900},{94,552}}, {{985,1000},{341,646}}, {{843,854},{341,552}}, {{938,948},{411,594}}, {{702,901},{589,599}}, {{530,1000},{636,646}}}
    };

    public static int[][][] coinsInParts = {
            {{30,25}, {30,43}, {30,61}, {30,79}, {30,97}, {30,115}, {30,133}, {30,151}, {48,25}, {66,25}, {84,25}, {84,43}, {84,61}, {84,79}, {84,97}, {84,115}, {84,133}, {84,151}, {102,25}, {102,79}, {120,25}, {120,79}, {120,97}, {120,115}, {120,133}, {120,151}, {138,25}, {138,79}, {156,25}, {156,79}},
            {{174,25}, {174,79}, {174,97}, {174,115}, {174,133}, {174,151}, {192,25}, {210,25}, {228,25}, {228,79}, {228,97}, {228,115}, {246,25}, {246,79}, {246,97}, {246,115}, {264,25}, {264,79}, {264,97}, {264,115}, {282,25}, {282,79}, {300,25}, {300,79}, {318,25}, {318,43}, {318,61}, {318,79}},
            {{336,25}, {336,79}, {354,25}, {354,79}, {372,25}, {372,79}, {372,97}, {372,115}, {390,25}, {390,79}, {390,97}, {390,115}, {408,25}, {408,79}, {408,97}, {408,115}, {408,133}, {408,151}, {426,25}, {444,25}, {462,25}, {462,79}, {480,25}, {480,79}, {498,25}, {498,79}},
            {{516,25}, {516,79}, {534,25}, {534,79}, {552,25}, {570,25}, {588,25}, {588,79}, {588,97}, {588,115}, {588,133}, {588,151}, {606,25}, {606,79}, {606,97}, {606,115}, {624,25}, {624,79}, {624,97}, {624,115}, {642,25}, {642,79}, {642,97}, {642,115}, {660,25}, {660,79}},
            {{678,25}, {678,43}, {678,61}, {678,79}, {696,25}, {696,79}, {714,25}, {714,79}, {732,25}, {732,79}, {732,97}, {732,115}, {750,25}, {750,79}, {750,97}, {750,115}, {768,25}, {768,79}, {768,97}, {768,115}, {786,25}, {786,79}, {786,97}, {786,115}, {804,25}, {822,25}, {822,79}, {822,97}, {822,115}, {822,133}, {822,151}},
            {{840,25}, {840,79}, {858,25}, {858,79}, {876,25}, {876,79}, {876,97}, {876,115}, {876,133}, {876,151}, {894,25}, {894,79}, {912,25}, {912,43}, {912,61}, {912,79}, {912,97}, {912,115}, {912,133}, {912,151}, {930,25}, {948,25}, {966,25}, {966,43}, {966,61}, {966,79}, {966,97}, {966,115}, {966,133}, {966,151}},
            {{138,320}, {159,320}, {30,169}, {30,187}, {30,205}, {30,223}, {30,241}, {30,259}, {30,277}, {30,295}, {30,313}, {30,331}, {48,259}, {48,277}, {66,259}, {66,277}, {84,169}, {84,187}, {84,205}, {84,223}, {84,241}, {84,259}, {84,277}, {84,295}, {84,313}, {84,331}, {120,169}, {120,187}, {120,205}, {120,223}, {120,241}, {120,259}, {120,277}, {120,295}, {120,313}, {120,331}},
            {{213,320}, {230,320}, {247,320}, {174,169}, {174,223}, {174,241}, {174,259}, {174,277}, {174,295}, {174,313}, {174,331}, {192,169}, {192,223}, {210,169}, {210,223}, {228,169}, {228,187}, {228,205}, {228,223}, {228,241}, {228,259}, {228,277}, {246,169}, {246,259}, {246,277}, {264,169}, {264,223}, {264,241}, {264,259}, {264,277}, {264,295}, {264,313}, {264,331}, {282,169}, {282,223}, {282,241}, {282,259}, {282,277}, {300,169}, {300,223}, {300,241}, {300,259}, {300,277}, {318,169}, {318,223}, {318,241}, {318,259}, {318,277}, {318,295}, {318,313}, {318,331}},
            {{336,169}, {336,223}, {354,169}, {354,223}, {372,169}, {372,187}, {372,205}, {372,223}, {372,259}, {372,277}, {372,295}, {372,313}, {372,331}, {390,169}, {390,187}, {390,205}, {390,223}, {390,259}, {390,277}, {390,295}, {390,313}, {390,331}, {408,169}, {408,187}, {408,205}, {408,223}, {408,259}, {408,277}, {408,295}, {408,313}, {408,331}, {426,169}, {426,223}, {426,259}, {426,277}, {444,169}, {444,223}, {444,259}, {444,277}, {462,169}, {462,223}, {462,241}, {462,259}, {462,277}, {480,169}, {480,223}, {480,241}, {480,259}, {480,277}, {498,169}, {498,223}, {498,241}, {498,259}, {498,277}},
            {{516,169}, {516,223}, {516,241}, {516,259}, {516,277}, {534,169}, {534,223}, {534,241}, {534,259}, {534,277}, {552,169}, {552,223}, {552,259}, {552,277}, {570,169}, {570,223}, {570,259}, {570,277}, {588,169}, {588,187}, {588,205}, {588,223}, {588,259}, {588,277}, {588,295}, {588,313}, {588,331}, {606,169}, {606,187}, {606,205}, {606,223}, {606,259}, {606,277}, {606,295}, {606,313}, {606,331}, {624,169}, {624,187}, {624,205}, {624,223}, {624,259}, {624,277}, {624,295}, {624,313}, {624,331}, {642,169}, {642,187}, {642,205}, {642,223}, {642,241}, {642,259}, {642,277}, {642,295}, {642,313}, {642,331}, {660,169}, {660,223}},
            {{749,320}, {766,320}, {781,320}, {678,169}, {678,223}, {678,241}, {678,259}, {678,277}, {678,295}, {678,313}, {678,331}, {696,169}, {696,223}, {696,241}, {696,259}, {696,277}, {714,169}, {714,223}, {714,241}, {714,259}, {714,277}, {732,169}, {732,223}, {732,241}, {732,259}, {732,277}, {732,295}, {732,313}, {732,331}, {750,169}, {750,259}, {750,277}, {768,169}, {768,259}, {768,277}, {786,169}, {786,187}, {786,205}, {786,223}, {786,241}, {786,259}, {786,277}, {804,169}, {804,223}, {822,169}, {822,223}, {822,241}, {822,259}, {822,277}, {822,295}, {822,313}, {822,331}},
            {{839,320}, {857,320}, {876,169}, {876,187}, {876,205}, {876,223}, {876,241}, {876,259}, {876,277}, {876,295}, {876,313}, {876,331}, {912,169}, {912,187}, {912,205}, {912,223}, {912,241}, {912,259}, {912,277}, {912,295}, {912,313}, {912,331}, {930,259}, {930,277}, {948,259}, {948,277}, {966,169}, {966,187}, {966,205}, {966,223}, {966,241}, {966,259}, {966,277}, {966,295}, {966,313}, {966,331}},
            {{30,349}, {30,367}, {30,385}, {30,403}, {30,421}, {30,439}, {30,457}, {30,475}, {30,493}, {48,367}, {48,385}, {66,367}, {66,385}, {84,349}, {84,367}, {84,385}, {84,403}, {84,421}, {84,439}, {84,457}, {84,475}, {84,493}, {120,349}, {120,367}, {120,385}, {120,403}, {120,421}, {120,439}, {120,457}, {120,475}, {120,493}},
            {{174,349}, {174,367}, {174,385}, {174,403}, {174,421}, {174,475}, {174,493}, {192,475}, {210,475}, {228,367}, {228,385}, {228,403}, {228,421}, {228,439}, {228,457}, {228,475}, {246,367}, {246,385}, {246,475}, {264,349}, {264,367}, {264,385}, {264,403}, {264,421}, {264,475}, {282,367}, {282,385}, {282,403}, {282,421}, {282,475}, {300,367}, {300,385}, {300,403}, {300,421}, {300,475}, {318,349}, {318,367}, {318,385}, {318,403}, {318,421}, {318,475}},
            {{336,475}, {354,475}, {372,349}, {372,367}, {372,385}, {390,349}, {390,367}, {390,385}, {408,349}, {408,367}, {408,385}, {408,403}, {408,421}, {408,439}, {408,457}, {408,475}, {408,493}, {426,367}, {426,385}, {426,403}, {426,421}, {426,475}, {444,367}, {444,385}, {444,403}, {444,421}, {444,475}, {462,367}, {462,385}, {462,475}, {480,367}, {480,385}, {480,475}, {498,367}, {498,385}, {498,475}},
            {{516,367}, {516,385}, {516,475}, {534,367}, {534,385}, {534,475}, {552,367}, {552,385}, {552,403}, {552,421}, {552,475}, {570,367}, {570,385}, {570,403}, {570,421}, {570,475}, {588,349}, {588,367}, {588,385}, {588,403}, {588,421}, {588,439}, {588,457}, {588,475}, {588,493}, {606,349}, {606,367}, {606,385}, {624,349}, {624,367}, {624,385}, {642,349}, {642,367}, {642,385}, {642,403}, {642,421}, {642,439}, {642,457}, {642,475}, {642,493}, {660,475}},
            {{678,349}, {678,367}, {678,385}, {678,403}, {678,421}, {678,475}, {696,367}, {696,385}, {696,403}, {696,421}, {696,475}, {714,367}, {714,385}, {714,403}, {714,421}, {714,475}, {732,349}, {732,367}, {732,385}, {732,403}, {732,421}, {732,475}, {750,367}, {750,385}, {750,475}, {768,367}, {768,385}, {768,475}, {786,367}, {786,385}, {786,403}, {786,421}, {786,439}, {786,457}, {786,475}, {804,475}, {822,349}, {822,367}, {822,385}, {822,403}, {822,421}, {822,475}, {822,493}},
            {{876,349}, {876,367}, {876,385}, {876,403}, {876,421}, {876,439}, {876,457}, {876,475}, {876,493}, {912,349}, {912,367}, {912,385}, {912,403}, {912,421}, {912,439}, {912,457}, {912,475}, {912,493}, {930,367}, {930,385}, {948,367}, {948,385}, {966,349}, {966,367}, {966,385}, {966,403}, {966,421}, {966,439}, {966,457}, {966,475}, {966,493}},
            {{30,511}, {30,529}, {30,547}, {30,565}, {30,583}, {30,601}, {30,619}, {48,619}, {66,619}, {84,511}, {84,529}, {84,547}, {84,565}, {84,583}, {84,601}, {84,619}, {102,565}, {102,619}, {120,511}, {120,529}, {120,547}, {120,565}, {120,619}, {138,565}, {138,619}, {156,565}, {156,619}},
            {{174,511}, {174,529}, {174,547}, {174,565}, {174,619}, {192,529}, {192,619}, {210,529}, {210,619}, {228,529}, {228,547}, {228,565}, {228,619}, {246,565}, {246,619}, {264,529}, {264,547}, {264,565}, {264,619}, {282,529}, {282,619}, {300,529}, {300,619}, {318,529}, {318,547}, {318,565}, {318,583}, {318,601}, {318,619}},
            {{336,529}, {336,547}, {336,565}, {336,619}, {354,529}, {354,547}, {354,565}, {354,619}, {372,565}, {372,619}, {390,565}, {390,619}, {408,511}, {408,529}, {408,547}, {408,565}, {408,619}, {426,529}, {426,619}, {444,529}, {444,619}, {462,529}, {462,565}, {462,619}, {480,529}, {480,565}, {480,619}, {498,529}, {498,565}, {498,619}},
            {{516,529}, {516,565}, {516,619}, {534,529}, {534,565}, {534,619}, {552,529}, {552,619}, {570,529}, {570,619}, {588,511}, {588,529}, {588,547}, {588,565}, {588,619}, {606,565}, {606,619}, {624,565}, {624,619}, {642,511}, {642,529}, {642,547}, {642,565}, {642,619}, {660,529}, {660,547}, {660,565}, {660,619}},
            {{678,529}, {678,547}, {678,565}, {678,583}, {678,601}, {678,619}, {696,529}, {696,619}, {714,529}, {714,619}, {732,529}, {732,547}, {732,565}, {732,619}, {750,565}, {750,619}, {768,565}, {768,619}, {786,529}, {786,547}, {786,565}, {786,619}, {804,529}, {804,619}, {822,511}, {822,529}, {822,547}, {822,565}, {822,619}},
            {{840,565}, {840,619}, {858,565}, {858,619}, {876,511}, {876,529}, {876,547}, {876,565}, {876,619}, {894,565}, {894,619}, {912,511}, {912,529}, {912,547}, {912,565}, {912,583}, {912,601}, {912,619}, {930,619}, {948,619}, {966,511}, {966,529}, {966,547}, {966,565}, {966,583}, {966,601}, {966,619}}
    };
    public static int[][] getRealPosition(int x, int y){
        int[][] realPosition = new int[2][5];
        for (int i = 0,c = 0; i <= 32; i += 8,c++){
            realPosition[0][c] = x + i ;
            realPosition[1][c] = y + i + 9;
        }
        return realPosition;
    }
    public static int[] setRealPositionX(int x){
        int[] realPosition = new int[2];
        realPosition[0] = x - 1;
        realPosition[1] = x - 33;
        return realPosition;
    }


    public static int[] setRealPositionY(int y){
        int[] realPosition = new int[2];
        realPosition[0] = y - 10;
        realPosition[1] = y - 42;
        return realPosition;
    }
    protected static boolean checkXAxis(int[][] position, int[][] l){
        if (position[1][0] > l[1][0] && position[1][0] < l[1][1]){
            if (position[1][4] < l[1][1] + 31) return false;
        } else if (position[1][1] > l[1][0] && position[1][1] < l[1][1]){
            if (position[1][4] < l[1][1] + 24) return false;
        } else if (position[1][2] > l[1][0] && position[1][2] < l[1][1]){
            if (position[1][4] < l[1][1] + 16) return false;
        } else if (position[1][3] > l[1][0] && position[1][3] < l[1][1]){
            if (position[1][4] < l[1][1] + 8) return false;
        } else if ((position[1][4] > l[1][0]) && (position[1][4] < l[1][1])){
            if (position[1][0] + 31 > l[1][0]) return false;
        }
        return true;
    }

    protected static boolean checkYAxis(int[][] position, int[][] l){
        if ((position[0][0] > l[0][0]) && (position[0][0] < l[0][1])){
            if (position[0][4] < l[0][1] + 31) return false;
        } else if ((position[0][1] > l[0][0]) && (position[0][1] < l[0][1])){
            if (position[0][1] < l[0][1] + 24) return false;
        } else if ((position[0][2] > l[0][0]) && (position[0][2] < l[0][1])){
            if (position[0][2] < l[0][1] + 16) return false;
        } else if ((position[0][3] > l[0][0]) && (position[0][3] < l[0][1])){
            if (position[0][3] < l[0][1] + 8) return false;
        } else if ((position[0][4] > l[0][0]) && (position[0][4] < l[0][1])){
            if (position[0][0] + 31 > l[0][0]) return false;
        }
        return true;
    }
    private static boolean checkIt(int x, int y, String side, boolean isMan, int whichGhost, int distance){
        //int part = straight.inWhichPartAmI(x, y) - 1;
        int[][] position = getRealPosition(x, y);
        //if (isMan) System.out.println(position[0][0] + ", " + position[1][0]);
        boolean flag = false;
        switch (side) {
            case "r":
                for (int[][] l: limits){
                    if ((position[0][4] + distance > l[0][0]) && (position[0][4] + distance < l[0][1])){
                            flag = checkXAxis(position,l);
                            if (!flag) {
                                /*if (isMan) MainClass.x = l[0][0] - 32;
                                else ghosts.ghostsPosition[whichGhost][0] = l[0][0] - 32;*/
                                break;
                            }
                    }
                }
                if (flag) return true;
                else return false;
            case "l":
                for (int[][] l: limits) {
                    if ((position[0][0] - distance > l[0][0]) && (position[0][0] - distance < l[0][1])){
                            flag = checkXAxis(position,l);
                            if (!flag) {
                                /*if (isMan) System.out.println("limited");
                                if (isMan) MainClass.x = l[0][1] + 1;
                                else ghosts.ghostsPosition[whichGhost][0] = l[0][1] + 1;*/
                                break;
                            }
                    }
                }
                if (flag) return true;
                else return false;
            case "u":
                for (int[][] l: limits){
                    if ((position[1][0] - distance < l[1][1]) && (position[1][0] - distance > l[1][0])){
                            flag = checkYAxis(position,l);
                            if (!flag) {
                                /*if (isMan) MainClass.y = l[1][1] - 10;
                                else ghosts.ghostsPosition[whichGhost][1] = l[1][1] - 10;*/
                                break;
                            }
                    }
                }
                if (flag) return true;
                else return false;
            case "d":
                for (int[][] l: limits) {
                    if ((position[1][4] + distance > l[1][0]) && (position[1][4] + distance < l[1][1])){
                            flag = checkYAxis(position,l);
                            if (!flag) {
                                /*if (isMan) MainClass.y = l[1][0] - 42;
                                else ghosts.ghostsPosition[whichGhost][1] = l[1][0] - 42;*/
                                break;
                            }
                    }
                }
                if (flag) return true;
                else return false;
        }
        System.out.println("Happened some error in the limiter.java checkit function");
        return true;
    }


    public static boolean checker(String side, int ghost, boolean isMan){

        if (!isMan) {
            return checkIt(ghosts.ghostsPosition[ghost][0], ghosts.ghostsPosition[ghost][1], side,false, ghost, 0);
        } else {
            return checkIt(MainClass.x, MainClass.y, side, true, 0, 0);
        }
    }

    public static boolean checkWall(String side, int ghost, boolean isPerson, int distance){
        if (!isPerson) {
            return checkIt(ghosts.ghostsPosition[ghost][0], ghosts.ghostsPosition[ghost][1], side,false, ghost, distance);
        } else {
            return checkIt(MainClass.x, MainClass.y, side, true, 0, distance);
        }
    }
    public static boolean checkWallWithPosition(String side, int[] directions, int distance){
        return checkIt(directions[0], directions[1], side, false, 0, distance);
    }

}
