package org.gearvrf.da_gearvrf;

import org.gearvrf.GVRTestActivity;
import org.gearvrf.misc.ColorShader;
import org.gearvrf.viewmanager.TestDefaultGVRViewManager;
import org.gearvrf.ActivityInstrumentationGVRf;
import org.gearvrf.BoundsValues;

import org.gearvrf.GVRContext;
import org.gearvrf.GVRMaterial;
import org.gearvrf.GVRSceneObject;

/**
 * Created by santhyago on 2/27/15.
 */
public class GVRTransformTest extends ActivityInstrumentationGVRf {

    private static final float UNPICKED_COLOR_R = 0.7f;
    private static final float UNPICKED_COLOR_G = 0.7f;
    private static final float UNPICKED_COLOR_B = 0.7f;
    private static final float UNPICKED_COLOR_A = 1.0f;

    private GVRSceneObject mSceneObject;

    public GVRTransformTest() {
        super(GVRTestActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        GVRContext gvrContext = TestDefaultGVRViewManager.mGVRContext;
        assertNotNull(gvrContext);
    }

    public void testRotateByAxisWithPivot() {
        //(float, float, float, float, float, float, float)
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().rotateByAxisWithPivot(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));

        mSceneObject.getTransform().rotateByAxisWithPivot(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
    }

    public void testSetRotationByAxis() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setRotationByAxis(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        mSceneObject.getTransform().setRotationByAxis(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
    }

    public void testSetRotation() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setRotation(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));

        mSceneObject.getTransform().setRotation(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
    }

    public void testRotate() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        GVRSceneObject mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("RenderDataScript is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("LeftSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().rotate(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        mSceneObject.getTransform().rotate(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
    }

    public void testRotateByAxis() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        GVRSceneObject mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("is null.", mSceneObject);
        mSceneObject.getTransform().rotateByAxis(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        mSceneObject.getTransform().rotateByAxis(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
    }

    public void testSetScale() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setScale(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getScaleX());
        mSceneObject.getTransform().setScale(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getScaleY());
    }

    public void testTranslate() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().translate(
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        mSceneObject.getTransform().translate(
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
    }

    public void testSetGetPositionX() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setPositionX(BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getPositionX());
        mSceneObject.getTransform().setPositionX(BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getPositionX());
    }

    public void testSetGetPositionY() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setPositionY(BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getPositionY());
        mSceneObject.getTransform().setPositionY(BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getPositionY());
    }

    public void testSetGetPositionZ() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setPositionZ(BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getPositionZ());
        mSceneObject.getTransform().setPositionZ(BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getPositionZ());
    }

    public void testSetGetScaleX() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setScaleX(BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getScaleX());
        mSceneObject.getTransform().setScaleX(BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getScaleX());
    }

    public void testSetGetScaleY() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setScaleY(BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getScaleY());
        mSceneObject.getTransform().setScaleY(BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getScaleY());
    }

    public void testSetScaleZ() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setScaleZ(BoundsValues.getFloatList().get(0));
        assertEquals(BoundsValues.getFloatList().get(0), mSceneObject.getTransform().getScaleZ());
        mSceneObject.getTransform().setScaleZ(BoundsValues.getFloatList().get(1));
        assertEquals(BoundsValues.getFloatList().get(1), mSceneObject.getTransform().getScaleZ());
    }

    public void ignoretestGetRotationYaw() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setRotation(1.0f,
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        float yaw = mSceneObject.getTransform().getRotationYaw();
        boolean result = (yaw >= 0) && (yaw <= 360);
        assertTrue(result);
        mSceneObject.getTransform().setRotation(1.0f,
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
        yaw = mSceneObject.getTransform().getRotationYaw();
        result = (yaw >= 0) && (yaw <= 360);
        assertTrue(result);
    }

    public void testGetRotationPitch() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setRotation(1.0f,
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        float pitch = mSceneObject.getTransform().getRotationPitch();
        boolean result = (pitch >= 0) && (pitch <= 360);
        assertTrue("Pitch 1: " + pitch, result);
        mSceneObject.getTransform().setRotation(1.0f,
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));

        pitch = mSceneObject.getTransform().getRotationPitch();
        result = (pitch >= 0) && (pitch <= 360);
        assertTrue("Pitch 2: " + pitch, result);
    }

    public void testGetRotationRoll() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        mSceneObject.getTransform().setRotation(1.0f,
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0),
                BoundsValues.getFloatList().get(0));
        float roll = mSceneObject.getTransform().getRotationRoll();
        boolean result = (roll >= 0) && (roll <= 360);
        assertTrue(result);
        mSceneObject.getTransform().setRotation(1.0f,
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1),
                BoundsValues.getFloatList().get(1));
        roll = mSceneObject.getTransform().getRotationRoll();
        result = (roll >= 0) && (roll <= 360);
        assertTrue(result);
    }

    public void testGetModelMatrix() {
        //TestDefaultGVRViewManager gvrViewManager = new TestDefaultGVRViewManager();
        //getActivity().setScript(gvrViewManager, "gvr_note4.xml");
        mSceneObject = getColorBoard(1.0f, 1.0f);
        assertNotNull("TestDefaultGVRViewManager is null.", TestDefaultGVRViewManager.mGVRContext);
        assertNotNull("GVRSceneObject is null.", mSceneObject);
        assertEquals(16, mSceneObject.getTransform().getModelMatrix().length);
    }

    private GVRSceneObject getColorBoard(float width, float height) {

        GVRContext gvrContext = TestDefaultGVRViewManager.mGVRContext;
        ColorShader mColorShader = new ColorShader(gvrContext);
        GVRMaterial material = new GVRMaterial(gvrContext, mColorShader.getShaderId());
        material.setVec4(ColorShader.COLOR_KEY, UNPICKED_COLOR_R, UNPICKED_COLOR_G, UNPICKED_COLOR_B, UNPICKED_COLOR_A);
        GVRSceneObject board = new GVRSceneObject(gvrContext, width, height);
        board.getRenderData().setMaterial(material);

        return board;
    }
}
