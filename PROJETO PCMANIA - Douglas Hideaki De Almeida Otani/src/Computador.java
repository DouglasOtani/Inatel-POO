public class Computador {
    public String marca;
    public float preco;
    public MemoriaUSB memoria_usb;
    public SistemaOperacional sistema_operacional = new SistemaOperacional();
    public HardwareBasico[] hardware_basico = new HardwareBasico[5];

    public Computador() {
        this.hardware_basico[0] = new HardwareBasico();
        this.hardware_basico[1] = new HardwareBasico();
        this.hardware_basico[2] = new HardwareBasico();
    }

    public void mostraPCConfigs() {
        System.out.print("Marca: ");
        System.out.println(this.marca);
        System.out.print("Sistema Operacional: ");
        System.out.print(this.sistema_operacional.nome + "  ");
        System.out.println(this.sistema_operacional.tipo + " bits");
        System.out.println("Hardwares:");

        for(int i = 0; i < this.hardware_basico.length; ++i) {
            if (this.hardware_basico[i] != null) {
                System.out.println("-------------------------------------");
                System.out.println(this.hardware_basico[i].nome);
                System.out.println(this.hardware_basico[i].capacidade);
                System.out.println("-------------------------------------");
            }
        }

        if (this.memoria_usb != null) {
            System.out.print("MemoriaUSB: ");
            System.out.print(this.memoria_usb.nome + " ");
            System.out.println(this.memoria_usb.capacidade);
        } else {
            System.out.println("Nao tem MemoriaUSB");
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria_usb = musb;
    }
}
