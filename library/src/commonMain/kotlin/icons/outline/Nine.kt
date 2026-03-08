package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Nine: ImageVector
    get() {
        if (_Nine != null) {
            return _Nine!!
        }
        _Nine = ImageVector.Builder(
            name = "Outline.Nine",
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
                moveTo(10f, 17f)
                horizontalLineToRelative(1.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13.25f)
                verticalLineToRelative(-3.125f)
                moveToRelative(0f, 0f)
                arcToRelative(3.125f, 3.125f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.25f, 0f)
                curveToRelative(0f, 1.726f, 1.4f, 2.5f, 3.125f, 2.5f)
                reflectiveCurveTo(15f, 11.851f, 15f, 10.125f)
            }
        }.build()

        return _Nine!!
    }

@Suppress("ObjectPropertyName")
private var _Nine: ImageVector? = null
