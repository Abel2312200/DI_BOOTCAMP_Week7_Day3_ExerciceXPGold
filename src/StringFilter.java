public class StringFilter {
    public List<String> search(List<String> list) {
        return list.stream().filter(item -> item.startsWith("a") && item.length() == 3).toList();
    }
}
