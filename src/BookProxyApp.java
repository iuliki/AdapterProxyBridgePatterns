public class BookProxyApp {
    public static void main(String[] args) {
        BookProxy proxy = new BookProxyImpl("Sample Book");

        proxy.display();
        proxy.open();
        proxy.close();
    }
}


//Cu acest pattern, creăm un intermediar care acționează ca o interfață către altă resursă, cum ar fi un fișier, o conexiune.
// Acest acces secundar furnizează un substitut pentru componenta reală și o protejează de complexitatea subiacentă.