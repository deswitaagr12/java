ppackage demoConv;

public class Main {
    public static void main(String[] args) {
        convCM m_to_cm = new convCM();
        m_to_cm.convMtoCM();

        convMM m_to_mm = new convMM();
        m_to_mm.convMtoCM();

        dispConv all = new dispConv();
        all.Display();

    }

}