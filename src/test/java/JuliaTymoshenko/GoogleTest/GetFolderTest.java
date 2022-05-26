package JuliaTymoshenko.GoogleTest;

import org.testng.annotations.Test;

import java.io.File;

public class GetFolderTest {
    @Test
    public void folderUniqueNameTest() {

        File folder = new File("/Users/admin/IdeaProjects");

        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            for (int j = i + 1; j < listOfFiles.length; j++) {
                //porivnyannya
                if (listOfFiles[i] == listOfFiles[j]) {
                    System.out.println("not unique");
                    break;
                }
            }
        }

    }
}
