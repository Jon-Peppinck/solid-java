package lsp;

public class Bad_ostrich extends Bad_bird {
  @Override
  public void fly() {
    throw new UnsupportedOperationException("Ostriches can't fly...");
  }
}
