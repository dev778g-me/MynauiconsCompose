package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.TrashTwo: ImageVector
    get() {
        if (_TrashTwo != null) {
            return _TrashTwo!!
        }
        _TrashTwo = ImageVector.Builder(
            name = "Outline.TrashTwo",
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
                moveToRelative(5.25f, 5.778f)
                lineToRelative(1.727f, 12.178f)
                curveToRelative(0.09f, 0.579f, 0.329f, 1.12f, 0.691f, 1.564f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.363f, 0.95f)
                lineToRelative(0.246f, 0.083f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.446f, 0f)
                lineToRelative(0.246f, -0.082f)
                curveToRelative(0.528f, -0.178f, 1f, -0.506f, 1.362f, -0.95f)
                reflectiveCurveToRelative(0.602f, -0.985f, 0.692f, -1.564f)
                lineToRelative(1.727f, -12.18f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                curveToRelative(3.728f, 0f, 6.75f, -0.784f, 6.75f, -1.75f)
                reflectiveCurveTo(15.728f, 4f, 12f, 4f)
                reflectiveCurveToRelative(-6.75f, 0.784f, -6.75f, 1.75f)
                reflectiveCurveTo(8.272f, 7.5f, 12f, 7.5f)
            }
        }.build()

        return _TrashTwo!!
    }

@Suppress("ObjectPropertyName")
private var _TrashTwo: ImageVector? = null
