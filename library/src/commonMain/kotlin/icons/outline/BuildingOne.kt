package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.BuildingOne: ImageVector
    get() {
        if (_BuildingOne != null) {
            return _BuildingOne!!
        }
        _BuildingOne = ImageVector.Builder(
            name = "Outline.BuildingOne",
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
                moveTo(2.25f, 22f)
                horizontalLineToRelative(19.5f)
                moveTo(4f, 22f)
                verticalLineTo(6.978f)
                curveToRelative(0f, -1.743f, 0f, -2.614f, 0.327f, -3.28f)
                arcTo(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.638f, 2.34f)
                curveTo(6.28f, 2f, 7.12f, 2f, 8.8f, 2f)
                horizontalLineToRelative(0.4f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, 0.34f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.311f, 1.359f)
                curveTo(14f, 4.364f, 14f, 5.235f, 14f, 6.978f)
                verticalLineTo(22f)
                moveTo(10f, 6f)
                horizontalLineTo(8f)
                moveToRelative(2f, 4f)
                horizontalLineTo(8f)
                moveToRelative(2f, 4f)
                horizontalLineTo(8f)
                moveToRelative(11.8f, 8f)
                verticalLineTo(11.444f)
                curveToRelative(0f, -2.305f, -0.798f, -3.148f, -2.925f, -3.148f)
                horizontalLineTo(14f)
            }
        }.build()

        return _BuildingOne!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingOne: ImageVector? = null
