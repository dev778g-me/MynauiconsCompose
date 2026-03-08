package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FunnyGhost: ImageVector
    get() {
        if (_FunnyGhost != null) {
            return _FunnyGhost!!
        }
        _FunnyGhost = ImageVector.Builder(
            name = "Outline.FunnyGhost",
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
                moveToRelative(8.699f, 10.646f)
                lineToRelative(-0.104f, -0.49f)
                moveToRelative(4.995f, -0.55f)
                lineToRelative(-0.104f, -0.49f)
                moveTo(8.5f, 15.57f)
                curveToRelative(1.258f, 0.316f, 2.686f, 0.316f, 4.123f, -0.069f)
                curveToRelative(1.436f, -0.385f, 2.672f, -1.099f, 3.604f, -2.001f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(12.587f, 15.637f)
                lineToRelative(0.478f, 0.974f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.693f, -1.322f)
                lineToRelative(-0.46f, -0.935f)
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

        return _FunnyGhost!!
    }

@Suppress("ObjectPropertyName")
private var _FunnyGhost: ImageVector? = null
