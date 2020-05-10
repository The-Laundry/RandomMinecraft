
public static class Modelelsnako extends EntityModel {
	private final RendererModel all;
	private final RendererModel torso;
	private final RendererModel lfoot;
	private final RendererModel larm;
	private final RendererModel head;
	private final RendererModel rarm;
	private final RendererModel rfoot;

	public Modelelsnako() {
		textureWidth = 64;
		textureHeight = 64;

		all = new RendererModel(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(all, 0.0F, 1.5708F, 0.0F);

		torso = new RendererModel(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(torso);
		torso.cubeList.add(new ModelBox(torso, 0, 0, -3.0F, -11.0F, -3.0F, 6, 10, 6, 0.0F, false));

		lfoot = new RendererModel(this);
		lfoot.setRotationPoint(-3.0F, -1.0F, -1.0F);
		all.addChild(lfoot);
		lfoot.cubeList.add(new ModelBox(lfoot, 18, 0, 0.0F, 0.0F, -2.0F, 9, 1, 3, 0.0F, false));

		larm = new RendererModel(this);
		larm.setRotationPoint(0.0F, -9.0F, -3.0F);
		all.addChild(larm);
		larm.cubeList.add(new ModelBox(larm, 24, 24, -1.0F, 0.0F, -1.0F, 3, 6, 1, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(4.0F, -8.0F, 0.0F);
		all.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 20, -2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, false));

		rarm = new RendererModel(this);
		rarm.setRotationPoint(0.0F, -9.0F, 3.0F);
		all.addChild(rarm);
		rarm.cubeList.add(new ModelBox(rarm, 16, 20, -1.0F, 0.0F, 0.0F, 3, 6, 1, 0.0F, false));

		rfoot = new RendererModel(this);
		rfoot.setRotationPoint(-3.0F, -1.0F, 1.0F);
		all.addChild(rfoot);
		rfoot.cubeList.add(new ModelBox(rfoot, 0, 16, 0.0F, 0.0F, -1.0F, 9, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		all.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}