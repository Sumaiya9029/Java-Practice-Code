
// package Assignment_1;

// 8.Define an interface named Filterable with abstract methods
// like apply_filter(filter_type) and reset_filter().
// Create two classes, ImageProcessor and DataAnalyzer, that
// both implement the Filterable interface.
// Implement the methods in each class to perform distinct actions relevant to image
// and data processing respectively, showcasing a shared contract with different
// implementations.

interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// ImageProcessor class
class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the image.");
    }

    public void reset_filter() {
        System.out.println("Resetting image filters to original state.");
    }
}

// DataAnalyzer class
class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the dataset.");
    }

    public void reset_filter() {
        System.out.println("Resetting data filters.");
    }
}

// Main class
public class _8Eight {
    public static void main(String[] args) {

        // Using ImageProcessor
        Filterable img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        System.out.println();

        // Using DataAnalyzer
        Filterable data = new DataAnalyzer();
        data.apply_filter("Outlier Removal");
        data.reset_filter();
    }
}