package resto.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RestoService {

    public int getResto(int x, int y, int n)
    {
        int aux = n % x;
        if(aux > y) {
            n -= ( aux - y );
            return n;
        }
        else if(aux == y)
        {
            return n;
        }
        else{
            n -= x;
            n += ( y - aux);
            return n;
        }
    }
}
