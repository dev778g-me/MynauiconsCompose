package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Sofa: ImageVector
    get() {
        if (_Sofa != null) {
            return _Sofa!!
        }
        _Sofa = ImageVector.Builder(
            name = "Filled.Sofa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 9.155f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.995f, -1.472f, -3.75f, -3.45f, -3.75f)
                horizontalLineToRelative(-9f)
                curveTo(5.522f, 3.25f, 4.05f, 5.005f, 4.05f, 7f)
                verticalLineToRelative(2.182f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.863f, 0.325f)
                curveToRelative(-0.476f, 0.276f, -0.937f, 0.768f, -0.937f, 1.493f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.995f, 1.472f, 3.75f, 3.45f, 3.75f)
                horizontalLineToRelative(1.05f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(7.5f)
                verticalLineTo(20f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(1.05f)
                curveToRelative(1.978f, 0f, 3.45f, -1.755f, 3.45f, -3.75f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.74f, -0.432f, -1.255f, -0.945f, -1.544f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.855f, -0.301f)
                moveTo(18.3f, 17.25f)
                horizontalLineTo(5.7f)
                curveToRelative(-1.005f, 0f, -1.95f, -0.931f, -1.95f, -2.25f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.01f, -0.004f, -0.083f, 0.188f, -0.194f)
                curveToRelative(0.203f, -0.118f, 0.522f, -0.204f, 0.88f, -0.212f)
                reflectiveCurveToRelative(0.665f, 0.064f, 0.852f, 0.17f)
                curveToRelative(0.162f, 0.091f, 0.18f, 0.165f, 0.18f, 0.236f)
                curveToRelative(0f, 0.693f, 0.051f, 1.592f, 0.408f, 2.335f)
                curveToRelative(0.186f, 0.388f, 0.464f, 0.753f, 0.874f, 1.018f)
                curveToRelative(0.412f, 0.266f, 0.905f, 0.397f, 1.468f, 0.397f)
                horizontalLineToRelative(6.8f)
                curveToRelative(0.563f, 0f, 1.056f, -0.131f, 1.468f, -0.397f)
                curveToRelative(0.41f, -0.265f, 0.688f, -0.63f, 0.874f, -1.018f)
                curveToRelative(0.357f, -0.743f, 0.408f, -1.643f, 0.408f, -2.336f)
                curveToRelative(0f, -0.008f, -0.004f, -0.082f, 0.188f, -0.193f)
                curveToRelative(0.203f, -0.118f, 0.522f, -0.204f, 0.88f, -0.212f)
                reflectiveCurveToRelative(0.665f, 0.064f, 0.852f, 0.17f)
                curveToRelative(0.162f, 0.091f, 0.18f, 0.165f, 0.18f, 0.236f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.319f, -0.945f, 2.25f, -1.95f, 2.25f)
            }
        }.build()

        return _Sofa!!
    }

@Suppress("ObjectPropertyName")
private var _Sofa: ImageVector? = null
