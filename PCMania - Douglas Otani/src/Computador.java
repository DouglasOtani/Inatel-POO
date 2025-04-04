public class Computador {
    public String marca;
    public float preco;
    public MemoriaUSB memoria_usb;
    public SistemaOperacional sistema_operacional;
    public HardwareBasico hardware_basico[];

    public Computador() {
        sistema_operacional = new SistemaOperacional();
        hardware_basico = new HardwareBasico[5];
        hardware_basico[0] = new HardwareBasico();
        hardware_basico[1] = new HardwareBasico();
        hardware_basico[2] = new HardwareBasico();
    }

    public void mostraPCConfigs(){
        System.out.print("Marca: ");
        System.out.println(this.marca);
        System.out.print("Sistema Operacional: ");
        System.out.print(this.sistema_operacional.nome + "  ");
        System.out.println(this.sistema_operacional.tipo + " bits");
        System.out.println("Hardwares:");
        for (int i = 0; i < this.hardware_basico.length; i++) {
            if (this.hardware_basico[i] != null) {
                System.out.println("-------------------------------------");
                System.out.println(this.hardware_basico[i].nome);
                System.out.println(this.hardware_basico[i].capacidade);
                System.out.println("-------------------------------------");
            }
        }
        if (memoria_usb != null) {
            System.out.print("MemoriaUSB: ");
            System.out.print(memoria_usb.nome + " ");
            System.out.println(memoria_usb.capacidade);
        }
        else {
            System.out.println("Nao tem MemoriaUSB");
        }
    }
    public void addMemoriaUSB(MemoriaUSB musb){
        memoria_usb = musb;
    }
}
