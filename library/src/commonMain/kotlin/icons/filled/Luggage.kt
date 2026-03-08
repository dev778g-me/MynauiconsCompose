package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Luggage: ImageVector
    get() {
        if (_Luggage != null) {
            return _Luggage!!
        }
        _Luggage = ImageVector.Builder(
            name = "Filled.Luggage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.25f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                moveToRelative(7f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                moveTo(14.245f, 3.951f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.197f, -0.196f)
                lineToRelative(-0.05f, -0.005f)
                horizontalLineTo(10f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.249f, 0.248f)
                verticalLineTo(5.25f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(4f)
                close()
                moveTo(15.75f, 5.25f)
                horizontalLineToRelative(0.353f)
                curveToRelative(1.822f, 0f, 3.107f, 0.382f, 3.876f, 1.217f)
                curveToRelative(0.78f, 0.847f, 0.844f, 1.96f, 0.724f, 2.946f)
                lineTo(20.09f, 15.4f)
                lineToRelative(-0.001f, 0.011f)
                curveToRelative(-0.093f, 0.796f, -0.317f, 1.706f, -1.122f, 2.378f)
                curveToRelative(-0.382f, 0.32f, -0.862f, 0.554f, -1.452f, 0.713f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.133f, 0.249f)
                horizontalLineTo(10.62f)
                arcToRelative(2.243f, 2.243f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.119f, 3f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.015f, -3.249f)
                curveToRelative(-0.589f, -0.159f, -1.069f, -0.394f, -1.45f, -0.713f)
                curveToRelative(-0.805f, -0.672f, -1.03f, -1.582f, -1.123f, -2.378f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.615f, -5.987f)
                lineToRelative(-0.035f, -0.375f)
                curveToRelative(-0.057f, -0.885f, 0.077f, -1.83f, 0.76f, -2.571f)
                curveToRelative(0.768f, -0.835f, 2.053f, -1.217f, 3.876f, -1.217f)
                horizontalLineToRelative(0.352f)
                verticalLineToRelative(-1.25f)
                arcTo(1.746f, 1.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 2.25f)
                horizontalLineToRelative(4.003f)
                lineToRelative(0.173f, 0.009f)
                arcToRelative(1.753f, 1.753f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.574f, 1.74f)
                close()
            }
        }.build()

        return _Luggage!!
    }

@Suppress("ObjectPropertyName")
private var _Luggage: ImageVector? = null
