package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.EuroCircle: ImageVector
    get() {
        if (_EuroCircle != null) {
            return _EuroCircle!!
        }
        _EuroCircle = ImageVector.Builder(
            name = "Outline.EuroCircle",
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
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                horizontalLineTo(8.5f)
                moveToRelative(0f, 0f)
                horizontalLineTo(7f)
                moveToRelative(1.5f, 0f)
                curveToRelative(0f, 2f, 1.565f, 4f, 3.75f, 4f)
                curveToRelative(1.209f, 0f, 2.126f, -0.267f, 2.75f, -0.867f)
                moveTo(8.5f, 12f)
                curveToRelative(0f, -2f, 1.25f, -4f, 3.75f, -4f)
                curveToRelative(1.209f, 0f, 2.126f, 0.267f, 2.75f, 0.866f)
            }
        }.build()

        return _EuroCircle!!
    }

@Suppress("ObjectPropertyName")
private var _EuroCircle: ImageVector? = null
