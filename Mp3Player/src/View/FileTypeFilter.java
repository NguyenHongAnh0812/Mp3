/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Nguyen Hong Anh
 */

public class FileTypeFilter extends FileFilter {

    private final String extension;

    private final String description;
    
    // Constructor Method
    public FileTypeFilter(String extension, String description){
        // Set Contructor Values
        this.extension = extension;
        this.description = description;
    }
    
    //@Override
    @Override
    public boolean accept(java.io.File file) {
        // If File Is Returning Directory
        if(file.isDirectory()){
            return true;
        }
        // Return File Name with Extension
        return file.getName().endsWith(extension);
    }

    //@Override
    @Override
    public String getDescription() {
        // Return To Display File Type and Description
        return description + String.format(" (*%s)", extension);
    }
    
}
