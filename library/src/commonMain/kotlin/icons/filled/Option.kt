package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Option: ImageVector
    get() {
        if (_Option != null) {
            return _Option!!
        }
        _Option = ImageVector.Builder(
            name = "Filled.Option",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.44f, 7.755f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.346f, -0.005f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(5.16f)
                curveToRelative(0.262f, 0f, 0.542f, -0.001f, 0.805f, 0.083f)
                curveToRelative(0.23f, 0.073f, 0.442f, 0.193f, 0.624f, 0.353f)
                curveToRelative(0.208f, 0.183f, 0.352f, 0.424f, 0.487f, 0.65f)
                lineToRelative(0.033f, 0.055f)
                lineToRelative(5.068f, 8.446f)
                curveToRelative(0.089f, 0.15f, 0.14f, 0.233f, 0.182f, 0.295f)
                lineToRelative(0.042f, 0.056f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.088f, 0.05f)
                lineToRelative(0.07f, 0.007f)
                curveToRelative(0.075f, 0.005f, 0.174f, 0.005f, 0.347f, 0.005f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-5.159f)
                curveToRelative(-0.262f, 0f, -0.544f, 0.001f, -0.807f, -0.083f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.624f, -0.353f)
                curveToRelative(-0.208f, -0.183f, -0.351f, -0.424f, -0.486f, -0.65f)
                lineToRelative(-0.034f, -0.055f)
                lineToRelative(-5.067f, -8.446f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.182f, -0.295f)
                lineToRelative(-0.043f, -0.056f)
                moveToRelative(-0.158f, -0.057f)
                lineToRelative(0.07f, 0.007f)
                close()
                moveTo(14.25f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _Option!!
    }

@Suppress("ObjectPropertyName")
private var _Option: ImageVector? = null
