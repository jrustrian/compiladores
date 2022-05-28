/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author vm-modern15
 */
public class Principal {
    
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\Lexer.flex";
        String ruta2 = "C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\LexerCup.flex";
        
        String[] rutaSyntax = {"-parser", "Syntax", "C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\Syntax.cup"};
        
        
        generator(ruta1, ruta2, rutaSyntax);
    }
    
    public static void generator(String ruta1, String ruta2, String[] rutaSyntax) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        
        java_cup.Main.main(rutaSyntax);
        
        Path rutaSym = Paths.get("C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        
        Path rutaSyn = Paths.get("C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\Syntax.java");
        if (Files.exists(rutaSyn)) {
            Files.delete(rutaSyn);
        }
        
        Files.move(
                Paths.get("C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\sym.java"), 
                Paths.get("C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\sym.java")
        );
        
        Files.move(
                Paths.get("C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\Syntax.java"), 
                Paths.get("C:\\Users\\vm-modern15\\Documents\\NetBeansProjects\\CQQ_0_1\\src\\codigo\\Syntax.java")
        );

    }
    
}
