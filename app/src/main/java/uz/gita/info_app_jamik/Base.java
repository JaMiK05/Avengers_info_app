package uz.gita.info_app_jamik;

public class Base {

    private static Base base;
    private int[][] resurs;
    private String[] names;
    private int[] text;
    private Colors[] colors;

    private Base() {
        loadImages();
        loadNames();
        loadText();
        loadColor();
    }

    private void loadImages() {
        resurs = new int[][]{{R.drawable.capitan1, R.drawable.capitan2, R.drawable.capitan3, R.drawable.capitan4, R.drawable.capitan5, R.drawable.capitan6,},
                {R.drawable.thor1, R.drawable.thor2, R.drawable.thor3, R.drawable.thor4, R.drawable.thor5, R.drawable.thor6,},
                {R.drawable.ironman1, R.drawable.ironman2, R.drawable.ironman3, R.drawable.ironman4, R.drawable.ironman5},
                {R.drawable.doctor1, R.drawable.doctor2, R.drawable.doctor3, R.drawable.doctor4, R.drawable.doctor5},
                {R.drawable.natawa1, R.drawable.natawa2, R.drawable.natawa3, R.drawable.natawa4, R.drawable.natawa5, R.drawable.natawa6, R.drawable.natawa7},
                {R.drawable.hawkeye1, R.drawable.hawkeye2, R.drawable.hawkeye3, R.drawable.hawkeye4, R.drawable.hawkeye5, R.drawable.hawkeye6},
                {R.drawable.wanda1, R.drawable.wanda2, R.drawable.wanda3, R.drawable.wanda4},
                {R.drawable.black1, R.drawable.black2, R.drawable.black3, R.drawable.black4, R.drawable.black5, R.drawable.black6, R.drawable.black7},
                {R.drawable.hulk1, R.drawable.hulk2, R.drawable.hulk3, R.drawable.hulk4, R.drawable.hulk5},
                {R.drawable.baki1, R.drawable.baki2, R.drawable.baki3, R.drawable.baki4},
                {R.drawable.vision1, R.drawable.vision2, R.drawable.vision3, R.drawable.vision4},
                {R.drawable.spiderman1, R.drawable.spiderman2, R.drawable.spiderman3, R.drawable.spiderman4, R.drawable.spiderman5},
                {R.drawable.loki1, R.drawable.loki2, R.drawable.loki3},
                {R.drawable.thanos1, R.drawable.thanos2, R.drawable.thanos3, R.drawable.thanos4, R.drawable.thanos5},
                {R.drawable.ultron1, R.drawable.ultron2, R.drawable.ultron3},
                {R.drawable.carl1, R.drawable.carl2, R.drawable.carl3, R.drawable.carl4, R.drawable.carl5, R.drawable.carl6, R.drawable.carl7},
        };
    }

    private void loadNames() {
        names = new String[]{"Capitan America",
                "Thor",
                "Ironman",
                "Doctor Strange",
                "Natasha Romanoff",
                "Hawkeye",
                "Wanda Maximoff",
                "Black Panther",
                "Hulk",
                "Winter Soldier",
                "Vision",
                "Spiderman",
                "Loki",
                "Thanos",
                "Ultron",
                "Capitan Marvel"};
    }

    private void loadText() {
        text = new int[]{
                R.string.capitan,
                R.string.thor,
                R.string.ironman,
                R.string.doctor,
                R.string.natawa,
                R.string.hawkeye,
                R.string.wanda,
                R.string.black,
                R.string.hulk,
                R.string.baki,
                R.string.vision,
                R.string.spiderman,
                R.string.loki,
                R.string.thanos,
                R.string.ultron,
                R.string.carl,
        };
    }

    private void loadColor() {
        colors = new Colors[]{new Colors(R.color.capitan, R.color.capitant),
                new Colors(R.color.thor, R.color.thort),
                new Colors(R.color.ironman, R.color.ironmant),
                new Colors(R.color.doctor, R.color.doctot),
                new Colors(R.color.nat, R.color.natt),
                new Colors(R.color.hawkeye, R.color.hawkeyet),
                new Colors(R.color.wanda, R.color.wandat),
                new Colors(R.color.black1, R.color.blackt),
                new Colors(R.color.hulk, R.color.hulkt),
                new Colors(R.color.baki, R.color.bakit),
                new Colors(R.color.vision, R.color.visont),
                new Colors(R.color.spiderman, R.color.spidermant),
                new Colors(R.color.loki, R.color.lokit),
                new Colors(R.color.thanos, R.color.thanost),
                new Colors(R.color.ultron, R.color.ultront),
                new Colors(R.color.carl, R.color.carlt)};
    }

    public static Base getInstance() {
        if (base == null) base = new Base();
        return base;
    }

    public Colors[] getColors() {
        return colors;
    }

    public int[][] getResurs() {
        return resurs;
    }

    public String[] getNames() {
        return names;
    }

    public int[] getText() {
        return text;
    }
}
