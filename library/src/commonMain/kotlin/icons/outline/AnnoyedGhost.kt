package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AnnoyedGhost: ImageVector
    get() {
        if (_AnnoyedGhost != null) {
            return _AnnoyedGhost!!
        }
        _AnnoyedGhost = ImageVector.Builder(
            name = "Outline.AnnoyedGhost",
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
                moveTo(9f, 15.5f)
                horizontalLineToRelative(6f)
                moveToRelative(-5f, -5.25f)
                horizontalLineTo(9f)
                moveToRelative(6f, 0f)
                horizontalLineToRelative(-1f)
            }
        }.build()

        return _AnnoyedGhost!!
    }

@Suppress("ObjectPropertyName")
private var _AnnoyedGhost: ImageVector? = null
