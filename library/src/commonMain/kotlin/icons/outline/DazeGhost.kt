package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.DazeGhost: ImageVector
    get() {
        if (_DazeGhost != null) {
            return _DazeGhost!!
        }
        _DazeGhost = ImageVector.Builder(
            name = "Outline.DazeGhost",
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
                moveToRelative(8f, 12f)
                lineToRelative(2f, -1.5f)
                lineTo(8f, 9f)
                moveToRelative(8f, 3f)
                lineToRelative(-2f, -1.5f)
                lineTo(16f, 9f)
                moveToRelative(0f, 7.25f)
                lineToRelative(-1.333f, -1f)
                lineToRelative(-1.334f, 1f)
                lineToRelative(-1.333f, -1f)
                lineToRelative(-1.333f, 1f)
                lineToRelative(-1.334f, -1f)
                lineToRelative(-1.333f, 1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 18.562f)
                verticalLineToRelative(-6.518f)
                curveTo(3f, 7.05f, 7.03f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.05f, 9f, 9.044f)
                verticalLineToRelative(6.517f)
                curveToRelative(0f, 1.162f, -0.967f, 2.519f, -2f, 2f)
                curveToRelative(-0.835f, -0.42f, -2.223f, -0.52f, -3f, 0f)
                curveToRelative(-0.874f, 0.585f, -2.126f, 0.585f, -3f, 0f)
                curveToRelative(-0.885f, -0.593f, -1.649f, -0.57f, -2.5f, 0f)
                curveToRelative(-0.874f, 0.585f, -2.126f, 0.585f, -3f, 0f)
                curveToRelative(-0.777f, -0.52f, -1.665f, -0.42f, -2.5f, 0f)
                curveToRelative(-1.033f, 0.519f, -2f, -0.838f, -2f, -2f)
            }
        }.build()

        return _DazeGhost!!
    }

@Suppress("ObjectPropertyName")
private var _DazeGhost: ImageVector? = null
