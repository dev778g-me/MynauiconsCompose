package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Ear: ImageVector
    get() {
        if (_Ear != null) {
            return _Ear!!
        }
        _Ear = ImageVector.Builder(
            name = "Outline.Ear",
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
                moveTo(7.555f, 16.46f)
                curveToRelative(0f, 1.68f, 0.86f, 3.04f, 2.415f, 3.04f)
                reflectiveCurveToRelative(2.819f, -1.14f, 3.221f, -3.04f)
                curveToRelative(0.733f, -3.451f, 5.496f, -4.293f, 3.628f, -8.878f)
                curveTo(14.799f, 2.622f, 6.75f, 3.899f, 6.75f, 9.618f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14f)
                curveToRelative(0.46f, 0f, 0.921f, -0.29f, 1.295f, -0.618f)
                curveToRelative(0.572f, -0.5f, 0.613f, -1.351f, 0.194f, -1.985f)
                curveToRelative(-0.407f, -0.619f, -1.336f, -1.173f, -1.156f, -2.018f)
                curveToRelative(0.595f, -2.793f, 4.222f, -2.41f, 4.463f, 0.383f)
            }
        }.build()

        return _Ear!!
    }

@Suppress("ObjectPropertyName")
private var _Ear: ImageVector? = null
