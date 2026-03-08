package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Plane: ImageVector
    get() {
        if (_Plane != null) {
            return _Plane!!
        }
        _Plane = ImageVector.Builder(
            name = "Outline.Plane",
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
                moveToRelative(14.134f, 6.992f)
                lineToRelative(3.396f, -3.397f)
                arcToRelative(2.033f, 2.033f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.875f, 2.875f)
                lineToRelative(-3.397f, 3.396f)
                lineToRelative(1.838f, 9.145f)
                curveToRelative(0.235f, 1.17f, -2.034f, 2.8f, -2.638f, 1.25f)
                lineToRelative(-2.69f, -6.904f)
                lineToRelative(-3.493f, 3.493f)
                curveToRelative(0.17f, 2.041f, 0.207f, 2.72f, -1.224f, 4.15f)
                lineToRelative(-2.175f, -3.626f)
                lineTo(3f, 15.199f)
                curveToRelative(1.43f, -1.431f, 2.109f, -1.395f, 4.15f, -1.224f)
                lineToRelative(3.493f, -3.492f)
                lineToRelative(-6.904f, -2.691f)
                curveToRelative(-1.55f, -0.604f, 0.08f, -2.874f, 1.25f, -2.638f)
                close()
            }
        }.build()

        return _Plane!!
    }

@Suppress("ObjectPropertyName")
private var _Plane: ImageVector? = null
