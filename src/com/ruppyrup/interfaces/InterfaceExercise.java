package com.ruppyrup.interfaces;

import java.io.IOException;
import java.util.function.Supplier;

public class InterfaceExercise {
    public static void main(String[] args) {
        Document d = new PdfDocument();
        System.out.println(d.getType());
    }
}

class Document {
    private String type = "dummy";
    private byte[] data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class PdfDocument extends Document {
    public PdfDocument() {
        super.setType("pdf"); // private fields aren't inherited
    }
}

interface Resetable {
    void reset();
}

abstract class Device implements Resetable {
}

class Radio extends Device {
    private double frequency = 1.1;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public void reset() {
        setFrequency(0.0);
    }
}

class TV extends Device {
    private int channel = 5;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void reset() {
        setChannel(0);
    }
}

class TestRadio {
    public static void main(String[] args) {
        Device t = new TV();
        Device r = new Radio();
        reset(t);
        reset(r);
        System.out.println(((Radio) r).getFrequency());
        System.out.println(((TV) t).getChannel());
    }

    public static void reset(Device resetable) {
        resetable.reset();
    }
}

class Pie {
    public void makePie() {
        System.out.println("Making pie");
    }

    public static int getCalories() {
        return 100;
    }
}

class PumpkinPie extends Pie {
    @Override
    public void makePie() {
        System.out.println("Making Pumpkin pie");
    }

    public static int getCalories() {
        return 150;
    }
}

class ApplePie extends Pie {
    @Override
    public void makePie() {
        System.out.println("Making Apple pie");
    }

    public static int getCalories() {
        return 220;
    }
}

class Nutritionist {
    public void printCalories(Pie pie) {
        int result;
        if (pie instanceof ApplePie)
            result = ((ApplePie) pie).getCalories();
        else if (pie instanceof PumpkinPie)
            result = PumpkinPie.getCalories();
        else result = Pie.getCalories();

        System.out.println(result);
    }
}

class TestPie {
    public static void main(String[] args) {
        Nutritionist nutritionist = new Nutritionist();
        Pie apple = new ApplePie();
        Pie pumpkin = new PumpkinPie();
        apple.makePie();
        nutritionist.printCalories(apple); // need to make this correct
        pumpkin.makePie();
        nutritionist.printCalories(pumpkin);
    }
}

abstract class Transformer {
    public abstract String transform(String data) throws IOException;
}

class XMLTransformer extends Transformer {
    @Override
    public String transform(String data) {
        return "xmldata";
    }
}

class NetworkTransformer extends Transformer {
    @Override
    public String transform(String data) throws IOException {
        return "data from network";
    }
}

enum TransformerType {
    NETWORK(NetworkTransformer::new),
    XML_TRANS(XMLTransformer::new);

    private final Supplier<Transformer> constructor;

    TransformerType(Supplier<Transformer> constructor) {
        this.constructor = constructor;
    }

    public Transformer getTransformer() {
        return constructor.get();
    }
}

class TestTransformer {
    public static void main(String[] args) throws IOException {
        var transformer1 = TransformerType.NETWORK.getTransformer();
        var transformer2 = TransformerType.XML_TRANS.getTransformer();
        System.out.println(transformer1.transform("bob"));
        System.out.println(transformer2.transform("bob"));
    }
}



