@Service

public  class BrinquedoImplement implements BrinquedoService {

    private final BrinquedoRepository brinquedoRepository;

    public BrinquedoRepository getBrinquedoRepository() {
        return brinquedoRepository;
    }

    @Override
    public Brinquedo criarBrinquedo(Brinquedo brinquedo) {
        return  brinquedoRepository.create(brinquedo);


    }

    @Override
    public Brinquedo obterBrinquedoPorId(Integer Id) {
       return brinquedoRepository.findById(id).orElse(null);


    }

    @Override
    public List<Brinquedo> listarTodosBrinquedos() {
        return  brinquedoRepository.findAll;


    }




}