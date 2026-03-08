package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CameraOff: ImageVector
    get() {
        if (_CameraOff != null) {
            return _CameraOff!!
        }
        _CameraOff = ImageVector.Builder(
            name = "Outline.CameraOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3f)
                horizontalLineToRelative(1.5f)
                moveTo(3f, 21f)
                lineToRelative(0.528f, -0.528f)
                moveTo(21f, 3f)
                lineToRelative(-2f, 2f)
                moveTo(3.528f, 20.472f)
                curveToRelative(0.302f, 0.339f, 0.697f, 0.528f, 1.108f, 0.528f)
                horizontalLineToRelative(14.728f)
                curveToRelative(0.434f, 0f, 0.85f, -0.21f, 1.157f, -0.586f)
                curveToRelative(0.307f, -0.375f, 0.479f, -0.884f, 0.479f, -1.414f)
                verticalLineTo(7f)
                curveToRelative(0f, -0.53f, -0.172f, -1.04f, -0.48f, -1.414f)
                curveTo(20.215f, 5.21f, 19.799f, 5f, 19.365f, 5f)
                horizontalLineTo(19f)
                moveTo(3.528f, 20.472f)
                lineToRelative(6.184f, -6.184f)
                moveToRelative(0f, 0f)
                arcTo(4.002f, 4.002f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.712f, -3.788f)
                moveToRelative(-5.076f, 5.076f)
                lineToRelative(5.076f, -5.076f)
                moveToRelative(0f, 0f)
                lineTo(19f, 5f)
                moveToRelative(-4.308f, 0f)
                horizontalLineToRelative(-4.309f)
                curveTo(8.659f, 5f, 8.325f, 3.269f, 6.827f, 3.026f)
                curveTo(6.563f, 2.983f, 6.289f, 3f, 6.022f, 3f)
                curveToRelative(-0.953f, 0f, -1.429f, 0f, -1.804f, 0.159f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.059f, 1.06f)
                curveTo(3f, 4.592f, 3f, 5.068f, 3f, 6.021f)
                verticalLineToRelative(9.734f)
            }
        }.build()

        return _CameraOff!!
    }

@Suppress("ObjectPropertyName")
private var _CameraOff: ImageVector? = null
