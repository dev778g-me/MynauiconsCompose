package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Minimize: ImageVector
    get() {
        if (_Minimize != null) {
            return _Minimize!!
        }
        _Minimize = ImageVector.Builder(
            name = "Outline.Minimize",
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
                moveTo(9.75f, 3.01f)
                curveToRelative(-0.04f, 2.79f, -0.247f, 4.37f, -1.308f, 5.432f)
                curveTo(7.38f, 9.502f, 5.799f, 9.71f, 3.01f, 9.75f)
                moveTo(9.75f, 21f)
                curveToRelative(-0.04f, -2.79f, -0.247f, -4.371f, -1.308f, -5.432f)
                reflectiveCurveTo(5.799f, 14.3f, 3.01f, 14.26f)
                moveTo(14.26f, 3.01f)
                curveToRelative(0.04f, 2.79f, 0.247f, 4.37f, 1.308f, 5.432f)
                curveTo(16.629f, 9.502f, 18.211f, 9.71f, 21f, 9.75f)
                moveTo(14.26f, 21f)
                curveToRelative(0.04f, -2.79f, 0.247f, -4.371f, 1.308f, -5.432f)
                reflectiveCurveTo(18.211f, 14.3f, 21f, 14.26f)
            }
        }.build()

        return _Minimize!!
    }

@Suppress("ObjectPropertyName")
private var _Minimize: ImageVector? = null
